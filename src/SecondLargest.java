import java.util.Scanner;

public class SecondLargest 
{
        static int max(int[] arr, int n)
        {
                if (n < 2)
                        return -1;

                int m = -1, l = -1;
                for (int i = 0; i < n; i++)
                {
                        if (m == -1 || arr[i] > arr[m])
                        {
                                l = m;
                                m = i;
                        }
                        else if (arr[i] < arr[m] && (l == -1 || arr[i] > arr[l]))
                                l = i;  
                }
                return l;
        }

        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                System.out.println(arr[max(arr, n)]);
        }
}
