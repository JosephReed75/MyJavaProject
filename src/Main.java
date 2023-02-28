import java.util.Scanner;

public class Main {

    // Main Method
    public static void main(String[] args) {
        boolean inputValid = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please enter a Number to convert to Roman Numerals");
            try {


            }catch (NumberFormatException nfe){

            }


        }while (!inputValid);




        new RomanNumeralConverter(2022);// Change this value to see function work
        new RomanNumeralConverter("MMXXII");// Change this string to a different roman numeral

    }
}