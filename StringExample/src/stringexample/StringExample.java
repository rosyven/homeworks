
package stringexample;
import java.util.Scanner;

public class StringExample {

    
    public static void main(String[] args) {
        
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        //String name = input.next();
        //String name = input.next();
        System.out.println("Ну, привет, " + name);
        
        //Длина строки
        int n = name.length();
        int numLastChar = n - 1;//номер последней буквы
        //Чтение заданного символа-буквы
        for(int i = numLastChar; i >= 0; i --)
        {
            System.out.println(name.charAt(i));
        }
        //получение части строки, напрмер, все символы между вторым и четвертым
        if(n >= 4)
        {
            String newString = name.substring(1, 3 + 1);
            //0 - первый
            System.out.println(newString);
        }
        //разбиение строки на части
        //получить отдельно имя и фамилию
        String[] words = name.split(" ");
        int M = words.length;
        String firstName = words[0];
        String lastName = words[1];
        System.out.printf("Вы ввели слов %d, это имя - %s и фамилия = %s \n", M, firstName, lastName);
        
        //определение, входит ли одна строка в другую
        boolean result = name.contains(lastName);
        if (result == true)
        {
            System.out.println("Строка " + name + " содержит строку = " + lastName);
        }
    }
    
}
