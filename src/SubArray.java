package MaximumSubArray;

import java.util.*;

public class SubArray {

    public static int MaxSub(int[] arr,int size,int m) {
        int sum = 0;
        int result = 0;
        for(int i=0;i<size;i++) {
            sum = 0;
            for(int j=0;j<size;j++)
            {
                if(sum+arr[j] <= m)
                {
                    sum += arr[i];
                }
            }
            if(result<sum)
            {
                result = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        System.out.println(MaxSub(arr, size, m));

    }

}