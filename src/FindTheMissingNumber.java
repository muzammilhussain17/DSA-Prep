import java.util.Scanner;

public class FindTheMissingNumber {
    public int MissingZero(int[] arr)
    {
        int n=arr.length;
        int expectedSum= n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<n;i++)
        {
            actualSum+=arr[i];
        }
        if(actualSum!=expectedSum)
        {
            return -1;
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        FindTheMissingNumber obj = new FindTheMissingNumber();

        int[] arr = {1,2,4,5};
        System.out.println(obj.MissingZero(arr));

    }
}
