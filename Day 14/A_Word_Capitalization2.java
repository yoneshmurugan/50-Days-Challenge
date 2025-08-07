import java.util.Scanner;
public class A_Word_Capitalization2{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String word = Scan.nextLine();
        String capitalizedword = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(capitalizedword);

    }
}