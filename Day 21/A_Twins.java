import java.util.Scanner;
public class A_Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        
        long halfSum = sum / 2;
        long currentSum = 0;
        int count = 0;

        java.util.Arrays.sort(a);
        
        for (int i = n - 1; i >= 0; i--) {
            currentSum += a[i];
            count++;
            if (currentSum > halfSum) {
                break;
            }
        }
        
        System.out.println(count);
    }
}