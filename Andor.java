package L.Operator;

public class Andor
{
    public static void main(String[] args) {

        char a = 'a', b = 'b';
        boolean c;
       //char c;
        c=a>b;
        System.out.println(c);
        int d=(c) ? 1:0;
      System.out.println(d);
        String str1 = new Boolean(c).toString();
        System.out.println(str1);
        System.out.println("andor git");

    }
}
