import java.util.Scanner;

public class Main {

    // Main Method
    public static void main(String[] args) {
        // variables for conversion
        int inNumber;
        String strInput;
        boolean validinput = false;

        // Setup Scanner
        Scanner in = new Scanner(System.in);
        // Keep looking until valid-input
        while (!validinput) {
            // Prompt the user
            System.out.println("Enter a Roman Numeral or Real number to convert--");
            // Get Keyboard Input
            strInput = in.next();

            if(!Character.isDigit(strInput.charAt(0))){
                validinput = true;
                new RomanNumeralConverter(strInput);// Change this value to see function work
            } else if (Character.isDigit(strInput.charAt(0))) {
                inNumber = Integer.parseInt(strInput);
                validinput = true;
                new RomanNumeralConverter(inNumber);// Change this string to a different roman numeral
            }
        }







    }
}