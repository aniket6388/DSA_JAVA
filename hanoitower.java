package DSA;

public class hanoitower {
    public static void main(String[] args) {
        int n = 5; // Number of disks
        hanoi(n, 'A', 'B', 'C'); // Call the hanoi function with peg names A, B, and C
    }

    public static void hanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n > 0) {
            // Move n - 1 disks from fromRod to auxRod, so they are out of the way
            hanoi(n - 1, fromRod, auxRod, toRod);

            // Move the nth disk from fromRod to toRod
            System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

            // Move the n - 1 disks that we left on auxRod to toRod
            hanoi(n - 1, auxRod, toRod, fromRod);
        }
    }
}
