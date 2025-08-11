import java.util.Scanner;
public class A_Bit{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int itt = scan.nextInt();
        int X = 0;
        for (int i=0; i<itt; i++){
            String operation = scan.next();
            if (operation.equals("++X") || operation.equals("X++")){
                X++;
            }
            else{
                X--;
            }
        }
        System.out.println(X);
    }
}