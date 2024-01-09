package DSA;

import java.util.*;
public class searching_array {
    public static void main(String[] args) {
        int i;
        int r=0;
        System.out.println("Enter the size of array = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of array = ");
        for(i = 0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value to search from array = ");
        int s = sc.nextInt();
        
        for(i=0; i<=n-1; i++){
            if(s==arr[i]){
                r=1;
                break;
            }
            
        }
        
        if(r==1){
            System.out.println(i);
        }
        else{
            System.out.println("Not found");
        }
    }
}
