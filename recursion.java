package DSA;

public class recursion {
    // To Print Number from 1 to 5
    public static void printnumber(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printnumber(n + 1);
    }

    // To Print Number from 5 to 1
    public static void printnumber2(int m) {
        if (m == 0) {
            return;
        }
        System.out.println(m);
        printnumber2(m - 1);
    }

    // To Print Sum of Numbers from 1 to 5
    public static void sum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum);
    }

    // To Find factorial
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int f = factorial(n - 1);
        int h = n * f;
        return h;
    }

    public static void main(String[] args) {
        int j = factorial(0);
        System.out.println(j);
    }
}
