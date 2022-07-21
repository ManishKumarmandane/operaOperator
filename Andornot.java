package L.Operator;

public class Andornot
{
    public static void main(String[] args)
    {

        int a = 85, b = 05;
        boolean  c;
       //c = ((a > b)&&(a < b));
        c = ((a >= b)&&(a <= b));
        System.out.println("false" +c);
        int x=30,y=36;
        boolean z;
        z= ((x<y)||(x>y));
        System.out.println("true"+z);
        int e=30;
        boolean g  = (e!=30);
        //int f= g;
        System.out.println(g);
        boolean h=false;
        System.out.println(!h);
        System.out.println("git");


    }
}
