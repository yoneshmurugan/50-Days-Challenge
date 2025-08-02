import java.util.Scanner;
public class A_Team {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int itt = scan.nextInt();
        int count = 0;
        for (int i = 0; i < itt; i++) {
            int inp1 = scan.nextInt();
            int inp2 = scan.nextInt();
            int inp3 = scan.nextInt();
            if (inp1 + inp2 + inp3 > 1) {
                count++;
            }
        }
        System.out.println(count);
    }

}