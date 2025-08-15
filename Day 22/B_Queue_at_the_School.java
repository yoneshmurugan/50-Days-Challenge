import java.util.Scanner;
public class B_Queue_at_the_School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String s = scan.next();
        char[] arr = s.toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    arr[j] = 'G';
                    arr[j + 1] = 'B';
                    j++;
                }
            }
        }
        System.out.println(new String(arr));
    }
}