import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itt = scanner.nextInt();
        int target = scanner.nextInt();
        int[] scores = new int[itt];
        for (int i = 0; i < itt; i++) {
            scores[i] = scanner.nextInt();
        }
        int kthScore = scores[target - 1];
        int advancers = 0; 
        for (int score : scores) {
            if (score >= kthScore && score > 0) {
                advancers++;
            } else {
                break;
            }
        }  
        System.out.println(advancers);  
    }
}
