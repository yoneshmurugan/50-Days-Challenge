import java.util.Scanner;
public class A_Petya_and_Strings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().toLowerCase();
        String secondString = scanner.nextLine().toLowerCase();

        int comparisonResult = firstString.compareTo(secondString);
        
        if (comparisonResult < 0) {
            System.out.println(-1);
        } else if (comparisonResult > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}