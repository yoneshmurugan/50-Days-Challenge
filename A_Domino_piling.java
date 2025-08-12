import java.util.Scanner;
public class A_Domino_piling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        int domino = 2;
        int totalsquares = length*breadth / domino;
        System.out.println(totalsquares);

    }
}
