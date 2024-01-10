//Program to delete an element from a specific position in an array
package DSA;
import java.util.*;
public class delete_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int i;
        System.out.println("Enter the elements of array = ");
        for(i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position = ");
        int pos = sc.nextInt();
        if((pos>size)||(pos<0)){
            System.out.println("Invalid Position");
        }
        else{
            int arr1[] = new int[size-1];
            for(i=0; i<=size-2; i++){
                if (i < pos) 
                arr1[i] = arr[i];        
            else
                arr1[i] = arr[i + 1];
            }
            for(i=0; i<=size-2; i++){
                System.out.print(arr1[i]+" ");
            }
        }

    }
}
