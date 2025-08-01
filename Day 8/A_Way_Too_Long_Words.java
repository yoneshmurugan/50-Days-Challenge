import java.util.Scanner;
public class A_Way_Too_Long_Words {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int itt = scan.nextInt();
        for (int i = 0; i < itt; i++) {
            String word = scan.next();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
