
/**
 * Write a description of class Prime here.
 *
 * @author (kishlay kumar)
 * @version (21/07/2021)
 */
import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        int i,j,n,x,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        n=in.nextInt();
        System.out.println("All prime numbers upto : "+n);
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }
}
    