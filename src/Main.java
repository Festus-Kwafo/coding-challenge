import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseString reverseString = new ReverseString();
        String sentenceInput = input.nextLine();
        String results = reverseString.reverseMethod(sentenceInput);
        System.out.println(results);
    }
}