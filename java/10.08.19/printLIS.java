import java.util.*;
public class printLIS
{
    static void sizeOfLIS(int[] a, int[] t)
    {
        t[0] = 1;
        for(int i = 1; i < t.length; i++)
        {
            int max = -1;
            for(int j = 0; j < i; j++)
            {
                if(a[j] < a[i])
                {
                    if(max < t[j])
                        max = t[j];
                }
            }
            t[i] = max+1;
        }
        int max = -1;
        for(int i = 0; i < t.length; i++)
        {
            if(max<t[i]) max = t[i];
        }
        return;
    }

    printLIS(int[] a, int[] t)
    {
        
    }
    public static void main(String[] args) 
    {
        int[] a = {10, 21, 9, 33, 22, 50, 41, 60, 80, 7};
        int[] t = new int[a.length];
        sizeOfLIS(a, t);
        printLIS(a, t);
    }
}