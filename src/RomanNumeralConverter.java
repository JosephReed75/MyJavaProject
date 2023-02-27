public class RomanNumeralConverter {

    // Constructor that Converts Integer to Roman Numeral
    RomanNumeralConverter(int num) {

        // Print the Number Entered
        System.out.println("Integer: " + num);
        // Int Array to hold the number values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // String Array to hold the Roman Numerals
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        // StringBuilder for outputting Roman Numeral
        StringBuilder roman = new StringBuilder();

        // Looping through the arrays
        for (int i = 0; i < values.length; i++) {

/*          If input number is >= highest roman numeral, add it to the string builder
            and reduce its corresponding value from the input number.
            If input number is < highest roman numeral, then check with next highest roman numerals.
            Repeat the process above till the input number becomes 0.*/
            while (num >= values[i]) {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        System.out.println("Corresponding Roman Numerals is: " + roman);
    }

    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Constructor that Converts a Roman Numeral to Integer
    RomanNumeralConverter(String str) {

        // Print the Number Entered
        System.out.println("Roman Numeral: " + str);
        //variable to store the sum
        int total = 0;
        //loop iterate over the string (given roman numeral)
        //getting value from symbol s1[i]
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            //getting value of symbol s2[i+1]
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                //comparing the current character from its right character
                if (s1 >= s2) {
                //if the value of current character is greater or equal to the next symbol
                    total = total + s1;
                } else {
                    //if the value of the current character is less than the next symbol
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        //returns corresponding integer value
        System.out.println("Corresponding Real Number is: " + total);
    }


}
