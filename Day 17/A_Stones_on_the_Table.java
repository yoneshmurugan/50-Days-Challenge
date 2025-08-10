import java.util.Scanner;
public class A_Stones_on_the_Table {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        String s = scan.next();
            for(int j = 0; j < s.length()-1; j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    count++;
                }
            }
        
        System.out.println(count);
    }
}