package L.Operator;

public class Notequal
{
    public static void main(String[] args)
    {
        int a=10,b=20;
        boolean c;
        c=a<=b;
        System.out.println("a is less equal to b ture   "+c);
        c=a>=b;
        System.out.println("a is greater equal to b false  "+c) ;
        c=a==b;
        System.out.println("a is equal to b false ="  +c);
        c=b==a;
        System.out.println("b is equal to b flase= "+c);
        int d=10, e=10;
        boolean f;
        f= d==e;
        System.out.println("d is equal to e true" +f);
        int x=20, y=10;
        boolean z;
        z= x>=y;
        System.out.println("x is greater  than equal to y  true="+z);
        z=x<=y;
        System.out.println("x is less than equal to y false ="+z);
    }
}
