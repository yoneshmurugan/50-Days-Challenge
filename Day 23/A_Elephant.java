import java.util.Scanner;
public class A_Elephant{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int steps= scan.nextInt();
        int count= 0;
        for (int i = 5 ; i>0; i--){
            int num = steps/i;
            count+=num;
            num = 0;
            steps = steps%i; 
        } 
        System.out.println(count);


    }
}