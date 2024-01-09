package DSA;

import java.util.*;

import javax.sound.midi.Soundbank;
public class user_input_array {
    public static void main(String[] agrs){
            System.out.print("Enter the size of array = ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int []arr = new int[n];
            System.out.println("Enter the Element of array = ");
            for(int i=0; i<=n-1; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<=n-1; i++){
                System.out.print(arr[i]+" ");
            }
            sc.nextLine();
            int sum = 0;
            for(int i = 0; i<=n-1; i++){
            sum = sum+arr[i];
            }
            System.out.println("Sum = "+sum);
    }
}
