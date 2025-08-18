import java.util.Scanner;
public class A_Word{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int upper=0;
        int lower=0; 
        for (int i=0 ; i<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                upper+=1;
            }
            else {
                lower +=1;
            }
        }
        if (upper<=lower){
            for (int j=0; j< word.length();j++){
                System.out.print(Character.toLowerCase(word.charAt(j)));
            }
        }
        else{
            for (int i=0; i <word.length();i++){
               System.out.print(Character.toUpperCase(word.charAt(i)));
            }
        }
        
    }
}