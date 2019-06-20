import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter in a string of letters.");
        String input = read.nextLine().toUpperCase();
        ArrayList<Character> sorted = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            boolean added = false;
            for (int j = 0; j < sorted.size(); j++) {
                if (input.charAt(i) < sorted.get(j)) {
                    sorted.add(j, input.charAt(i));
                    added = true;
                    break;
                }
            }
            if (!added) {
                sorted.add(input.charAt(i));
            }
        }

        System.out.println(sorted);
    }
}
