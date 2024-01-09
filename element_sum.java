package DSA;

public class element_sum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0; i<=8; i++){
            sum = sum+arr[i];
            
        }
        float s = sum;
        System.out.println(s/8);
    }
}
