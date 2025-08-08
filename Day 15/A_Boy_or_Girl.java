import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        Set<Character> distinctCharacters = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctCharacters.add(c);
        }
        if (distinctCharacters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        scanner.close();
    }
}