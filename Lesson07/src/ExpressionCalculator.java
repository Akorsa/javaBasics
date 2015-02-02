import stack.Stack;

public class ExpressionCalculator {

    private String exp;
    private final String OPER = "*/+-";
    private final String NUM = ".0123456789";
    private final char OPENING_PARENTHESIS = "(".charAt(0);
    private final char CLOSING_PARENTHESIS = ")".charAt(0);
    private final String BAD_PARENTHESES = "Parentheses are not coordinated";

    ExpressionCalculator(String exp) {
        this.exp = exp;
    }

    ExpressionCalculator() {
        this(null);
    }

    public String translateToRPN() {
        return translateToRPN(exp);
    }

    public String translateToRPN(String exp) {
        this.exp = exp;

        if ((this.exp != null) && !(this.exp.trim().isEmpty())) {
            StringBuilder output = new StringBuilder();
            Stack stack = new Stack();

            // analyze the input string (for each char in string)
            for (char currChar : exp.toCharArray()) {
                if (NUM.indexOf(currChar) != -1) {
                    // if currChar is a digit
                    output.append(currChar);
                } else if (currChar == OPENING_PARENTHESIS) {
                    stack.push(currChar);
                } else if (currChar == CLOSING_PARENTHESIS) {
                    //while Top != OPENING_PARENTHESIS -> stack content to output
                    while (stack.getSize() > 0 && (stack.getTop().toString().charAt(0) != OPENING_PARENTHESIS)) {
                        output.append(" ");
                        output.append(stack.pop().toString());
                    }
                    if (stack.getSize() == 0) { // if there is no opening parenthesis in the stack
                        return BAD_PARENTHESES;
                    } else {
                        stack.pop(); // remove "("
                    }
                } else if (OPER.indexOf(currChar) != -1) { // if currChar is an operator
                    if (stack.getSize() == 0) {
                        // if the stack is empty
                        output.append(" "); // delimiter for numbers
                        stack.push(currChar);
                    } else {
                        // pop the Top out of the stack while
                        // current operator has the same or lower priority as
                        // the priority of popping out operator
                        while (stack.getSize() > 0 && !compareOps(currChar, stack.getTop().toString().charAt(0))) {
                            output.append(" "); // delimiter for numbers
                            output.append(stack.pop().toString());
                        }
                        output.append(" "); // delimiter for numbers
                        stack.push(currChar);
                    }
                } else if (" ".indexOf(currChar) == -1) {
                    throw new IllegalArgumentException("Expression contains incorrect symbols. " +
                            "It could be the delimiter (\".\" expected).");
                }
            }
            // pop out the rest of the stack
            while (stack.getSize() > 0) {
                // checking parentheses coordination
                if (stack.getTop().toString().charAt(0) == OPENING_PARENTHESIS) {
                    return BAD_PARENTHESES;
                }
                output.append(" ");
                output.append(stack.pop().toString());
            }
            return output.toString();
        }
        return exp;
    }

    public double calculate() {
        return calculate(translateToRPN());
    }


    // *** Private methods ***

    /**
     * Calculates the expression in Reverse Polish Notation
     * @param expRPN
     *        {@code String} expression in Reverse Polish Notation
     * @return {@code int} result
     */
    private double calculate(String expRPN) {
        if (expRPN != null && !expRPN.trim().isEmpty()) {
            if (expRPN.equals(BAD_PARENTHESES)) {
                System.out.println(BAD_PARENTHESES);
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            Stack stack = new Stack();

            for (int i=0; i < expRPN.length(); i++) {
                char currChar = expRPN.charAt(i);
                if (NUM.indexOf(currChar) != -1) {
                    // numbers -> to stack
                    sb.append(currChar);
                    if (expRPN.charAt(i + 1) == " ".charAt(0)) {
                        stack.push(sb.toString());
                        sb.delete(0, sb.length());
                    }
                } else if (OPER.indexOf(currChar) != -1) {
                    // if currChar is an operator - calculate
                    double secondOperand = Double.parseDouble(stack.pop().toString());
                    double firstOperand = Double.parseDouble(stack.pop().toString());
                    stack.push(calcOper(firstOperand, secondOperand, String.valueOf(currChar)));
                }
            }
            return Double.parseDouble(stack.getTop().toString());
        }
        return 0;
    }


    /**
     * Method compares the priority of two operators.
     * @param op1
     *        First operator
     * @param op2
     *        Second one
     * @return
     *        <tt>true</tt> if the {@code op1} has the highest priority as the priority of the {@code op2}
     *        <tt>false</tt> otherwise
     */
    private boolean compareOps(char op1, char op2) {
        return getOpPriority(op1) > getOpPriority(op2);
    }

    /**
     * Method returns the priority of the operator
     * @param op operator
     * @return {@code int} representation of priority
     * @throws IllegalArgumentException if {@code op} is unknown
     */
    private int getOpPriority(char op) {
        if ("()".indexOf(op) != -1) {
            return 0;
        } else if ("+-".indexOf(op) != -1){
            return 1;
        } else if ("*/".indexOf(op) != -1){
            return 2; // the highest priority
        } else {
            throw new IllegalArgumentException();
        }
    }


    /**
     * Calculate the binary operation
     * @param first
     *        First operand
     * @param second
     *        Second one
     * @param oper
     *        Specified operation
     * @return {@code int} result of operation
     */
    private double calcOper(double first, double second, String oper) {
        switch (oper) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                return 0;
        }
    }
}
