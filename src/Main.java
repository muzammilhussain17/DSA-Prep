
public class Main {

    public static String reverse(String S)
    {
        char[] arr=S.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while (left <right)
        {
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String S = "Hello World";
        String reversed = reverse(S);
        System.out.println("Reversed string: " + reversed);
    }
}