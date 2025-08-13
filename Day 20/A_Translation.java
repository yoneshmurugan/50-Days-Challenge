import java.util.Scanner;
public class A_Translation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 =scan.nextLine();
        if (str1.length() != str2.length()){
            System.out.println("NO");
            return;
        }
        else{
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(str2.length()-1-i)){
                System.out.println("NO");
                return;
            }
        }
    }
        System.out.println("YES");
    }
}




        
       