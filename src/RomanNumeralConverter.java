public class RomanNumeralConverter {

    // Constructor that Converts Integer to Roman Numeral
    RomanNumeralConverter(int num){

        // Print the Number Entered
        System.out.println("Integer: " + num);
        // Int Array to hold the number values
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // String Array to hold the Roman Numerals
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        // StringBuilder for outputting Roman Numeral
        StringBuilder roman = new StringBuilder();

        // Looping through the arrays
        for(int i=0;i<values.length;i++)
        {

/*          If input number is >= highest roman numeral, add it to the string builder
            and reduce its corresponding value from the input number.
            If input number is < highest roman numeral, then check with next highest roman numerals.
            Repeat the process above till the input number becomes 0.*/
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        System.out.println("Corresponding Roman Numerals is: " + roman);
    }


}
