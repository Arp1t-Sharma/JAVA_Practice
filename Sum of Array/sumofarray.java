public class sumofarray {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6};
        int sum =0;
        for(int num : arr){
            sum +=num;
        }
        System.out.println("Sum of the array is: " + sum);
    }
}
