import org.junit.Assert;
import org.junit.Test;

public class ExpCalcTest {

    @Test
    public void expCalcSpaces() {
        ExpressionCalculator ec = new ExpressionCalculator("(2 + 5) * 15 - 6 * 45.5 + (10 - 6) * 8");
        Assert.assertEquals("Translate an expression with spaces  to RPN",
                "2 5 + 15 * 6 45.5 * - 10 6 - 8 * +", ec.translateToRPN());
        Assert.assertEquals(-136, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression without spaces to RPN",
                "2 5 + 15 * 6 45.5 * - 10 6 - 8 * +",
                ec.translateToRPN("(2+5)*15-6*45.5+(10-6)*8"));
        Assert.assertEquals(-136, ec.calculate(), 0);
    }

    @Test
    public void expCalcDiffExps() {
        ExpressionCalculator ec = new ExpressionCalculator();

        Assert.assertEquals("Translate an expression to RPN",
                "6 2 / 1 2 + *",
                ec.translateToRPN("6/2*(1+2)"));
        Assert.assertEquals(9, ec.calculate(), 0);


        Assert.assertEquals("Translate an expression to RPN",
                ".2 7 3 + / 7 * 5 4 * 2 / -",
                ec.translateToRPN(".2/(7+3)*7-5*4/2"));
        Assert.assertEquals(-9.86, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "2 5 + 16 6 - * 45.5 * 10 6 - 8 * +",
                ec.translateToRPN("(2+5)*(16-6)*45.5+(10-6)*8"));
        Assert.assertEquals(3217, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "3 1 - 4 * 5 10 / +",
                ec.translateToRPN("(3-1)*4+5/10"));
        Assert.assertEquals(8.5, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "5 6 + 2 * 4 5 * - 3 * 10 / 5 75 6 4 + 7 * - 4 * + 8 * +",
                ec.translateToRPN("(((5+6)*2-4*5)*3)/10+(5+(75-(6+4)*7)*4)*8"));
        Assert.assertEquals(200.6, ec.calculate(), 0);
    }

    @Test
    public void expCalcZeroDiv() {
        ExpressionCalculator ec = new ExpressionCalculator();

        Assert.assertEquals("Translate an expression to RPN",
                "5 0 /",
                ec.translateToRPN("5/0"));
        Assert.assertEquals(Double.POSITIVE_INFINITY, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "4 5 - 0 /",
                ec.translateToRPN("(4-5)/0"));
        Assert.assertEquals(Double.NEGATIVE_INFINITY, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "0 0 /",
                ec.translateToRPN("0/0"));
        Assert.assertEquals(Double.NaN, ec.calculate(), 0);
    }

    @Test
    public void expCalcParentheses() {
        ExpressionCalculator ec = new ExpressionCalculator();

        Assert.assertEquals("Translate an expression to RPN",
                "Parentheses are not coordinated",
                ec.translateToRPN("(2+6)*7)"));
        Assert.assertEquals(0, ec.calculate(), 0);

        Assert.assertEquals("Translate an expression to RPN",
                "Parentheses are not coordinated",
                ec.translateToRPN("(((2+6)*7)"));
        Assert.assertEquals(0, ec.calculate(), 0);
    }

    @Test
    public void expCalcException() {
        ExpressionCalculator ec = new ExpressionCalculator("(((2+6,5)*7)");

        try {
            ec.translateToRPN();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e);
        }

        try {
            ec.calculate();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e);
        }
    }
}
