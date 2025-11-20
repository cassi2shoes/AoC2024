import java.util.Arrays;
import java.lang.Math;

public class main
{
    public static void main(String[] args)
    {
        int[] leftList = {3, 4, 2, 1, 3, 3};
        int[] rightList = {4, 3, 5, 3, 9, 3};
        int [] newLeft = sortNum(rightList);
        int [] newRight = sortNum(leftList);
        //System.out.println(distance(newLeft, newRight));
        for (int x: newLeft)
        {
            System.out.print(newLeft[x] + " ");
        }   
        System.out.println("");
        for (int x: newRight)
        {
            System.out.print(newRight[x] + " ");
        }   

    }
    public static int[] sortNum(int[] a)
    {
        int[] c= new int[a.length];
        for (int i = 0; i<a.length; i++)
        {
            int b = Integer.MAX_VALUE;
            for(int j = 0; j<a.length; j++)
            {
                if ( a[i] < a[j])
                {
                    b= i;
                    
                }
            }
            c[i]=b;
            
        }
        return c;
    }
    public static int distance(int[] left, int[] right)
    {
        int sum=0;
        for (int i = 0; i<left.length; i++)
        {
            int dif = left[i]-right[i];
            sum+=dif;
        }
        return sum;
    }
}
