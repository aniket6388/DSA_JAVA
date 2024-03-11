package DSA;

import java.util.*;

public class binarySearch1 {
    public static void binarySearch(int[] arr, int key) {
        int LB = 0, UB = arr.length - 1, flag = 0;
        int mid = 0;
        while (LB <= UB) {
            mid = (LB + UB) / 2;
            if (key == arr[mid]) {
                flag = 1;
                break;
            }
            if (arr[mid] > key) {
                UB = mid - 1;
            } else {
                LB = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element is found at index : " + mid);
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element of array = ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter  the number you want to search for: ");
        int num = scanner.nextInt();
        binarySearch(arr, num);
    }
}
