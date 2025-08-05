import java.util.Scanner;
public class A_String {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int itt = scan.nextInt();
        for (int i = 0; i < itt; i++) {
            String num = scan.next();
            int count=0;
            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(j);
                if (c == '1') {
                    count++;
                }
            }    
            System.out.println(count);
        }
    }
}