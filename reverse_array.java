//Program to reverse the elements of an array.
package DSA;
import java.util.*;
public class reverse_array {
   public static void main(String[] args){
    System.out.println("Enter the size of array = ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int []arr = new int[size];
    System.out.println("Enter the elements of array = ");
    for(int i = 0; i<size; i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<size; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.print('\n');
    for(int i=size-1; i>=0; i-- ){
        System.out.print(arr[i]+" ");
    }
   } 
}
