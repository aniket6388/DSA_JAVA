package DSA;

public class max_min_array {
        public static void main(String[] args) {
            int []arr = {1,2,3,4,5,6,7,8,9};
            int max=0, min=0, i;
            for( i = 1; i<=8; i++){
                if(arr[i]>max){
                    max= arr[i];
                }
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println("Maximum value is = "+max);
            System.out.println("Minimum value is = "+min);
        }
    
}
