/**
 * Created by Yezhov Sergey on 01.11.2014.
 *
 * task cast
 */
public class Task_cast {
    public static void main(String[] args) {
        int i1 = -1;
        System.out.printf("%x\n",i1);
        byte b = (byte) i1;
        System.out.printf("%x\n",b);
        char ch = (char) b;
        //System.out.println(ch);
        System.out.printf("%c\n",ch);
        int i2 = (int) ch;
        System.out.printf("%x\n",i2);
        /*
        int out = (int)(char)(byte)-1;
        System.out.println(out);
        */
    }
}
