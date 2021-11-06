
package stringsumdigits;

import java.util.Scanner;
public class StringSumDigits {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числа");
        String number = input.nextLine();
        System.out.println(number);
        
        int n = number.length();
        int numLastChar = n - 1;
        
        for(int i = numLastChar; i >= 0; i --)
        {
            System.out.println(number.charAt(i));
        }
        
    }
    
}
