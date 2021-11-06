
package stringwordstester;

import java.util.Scanner;
public class StringWordsTester {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = input.nextLine();
        
        String[] words = text.split(" ");
        int n = words.length;
        System.out.printf("Вы ввели %d слов", n);
    }
    
}
