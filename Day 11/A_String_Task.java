import java.util.Scanner;
public class A_String_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' &&
                c != 'o' && c != 'O' && c != 'u' && c != 'U' && c != 'y' && c != 'Y') {
                result.append('.').append(Character.toLowerCase(c));
            }
        }
        
        System.out.println(result);
    }
}