import java.util.Scanner;
public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("\\+");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        java.util.Arrays.sort(intNumbers);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < intNumbers.length; i++) {
            result.append(intNumbers[i]);
            if (i < intNumbers.length - 1) {
                result.append("+");
            }
        }
        System.out.println(result.toString());
    }
}