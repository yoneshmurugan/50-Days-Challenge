import java.util.Scanner;
public class A_Only_One_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itt = scanner.nextInt();
        while (itt>0){
            int num = scanner.nextInt();
            int quo= num/10;
            int mod1 = num%10;
            int mod2;
            while (quo>0){
                mod2 = quo%10;
                mod1 = mod1<=mod2?mod1:mod2;
                quo=quo/10;
            }
            System.out.println(mod1);
            itt-=1;
            }

        } 
    }