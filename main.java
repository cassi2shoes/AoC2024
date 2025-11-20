import java.util.Arrays;

public class HistorianHysteria
{
    public static void main(string[] args)
    {
        int[] leftList = {3, 4, 2, 1, 3, 3};
        int[] rightList = {4, 3, 5, 3, 9, 3};
        int [] newLeft = sortNum(rightList[]);
        int [] newRight = sortNum(leftList[]);
        System.out.println(distance(newLeft[], newRight[]));
    }
    public static int[] sortNum(int[] a)
    {
        return Arrays.sort(a);
    }
    public static int distance(int[] left, int[] right)
    {
        int sum;
        for (int i = 0; i<left.length; i++)
        {
            int dif = left[i]-right[i];
            sum+=dif;
        }
        return sum;
    }
}
