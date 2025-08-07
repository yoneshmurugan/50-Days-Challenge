import java.util.Scanner;
public class A_Word_Capitalization{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String word = Scan.nextLine();
        for (int i=0; i < word.length(); i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase(word.charAt(i)));
            } else {
                System.out.print(word.charAt(i));
            }
        }

    }
}