import java.util.Scanner;
public class A_Soldier_and_Bananas{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstPrice = scan.nextInt();
        int amountHas = scan.nextInt();
        int bananasNeed = scan.nextInt();
        int amountTot = 0;
        for (int i=1; i<=bananasNeed; i++){
           amountTot += i*firstPrice;
        }
        System.out.println(amountTot - amountHas>0 ?amountTot-amountHas:0);
    }
}