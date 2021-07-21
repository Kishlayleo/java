
/**
 * Write a description of class Fibonacci_Series here.
 * Printing Fibonacci series upto first 10 terms.
 *
 * @author (Kishlay kumar)
 * @version (22/07/2021)
 */
public class Fibonacci_Series
{
    public static void main(String args[])
    {
        int a=0,b=1,s=0,i;
        System.out.print(a+","+b);
        for(i=2;i<10;i++)
        {
            s=a+b;
            System.out.print(","+s);
            a=b;
            b=s;
        }
    }
}
   
        