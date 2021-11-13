
package stringcw1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCW1 {

    public static String readFromFile(String fileName)
    {
        String result = "";
        
        BufferedReader inputFile = null;
            try {
            inputFile = new BufferedReader(new FileReader(fileName));
            String strtmp2;
            while ((strtmp2 = inputFile.readLine()) != null) {
                //System.out.println(strtmp2);
                result = result + strtmp2;
                //double d = Double.parseDouble(strtmp2);
            }
            inputFile.close();
        } catch (Exception e) {
        }
        finally{
            try {
                inputFile.close();
            } catch (IOException ex) {
                Logger.getLogger(StringCW1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        return result;
    }
    
    public static void writeToFile(String fileName)
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
        PrintWriter output = null;
        try {
            output = new PrintWriter( new FileWriter("data.txt") );
            while(true)
            {
                String strtmp = input.readLine();
                if (strtmp.equals("stop"))
                    break;
                output.println(strtmp);
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Чтение файла, к которому нет доступа.");//TxtFileTester.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            output.close();
        }
    }
    public static void main(String[] args) {
            
            //System.out.println("");
            //writeToFile("mydata.txt");
            String resultFromFile = readFromFile("mydata.txt");
            String[] words = resultFromFile.split(" ");
            StringBuilder newString = new StringBuilder();
            for(int i = 0; i < words.length; i++)
            {
                String currentWord = words[i];
                currentWord = currentWord.trim();
                currentWord = currentWord.toLowerCase();
                String punctuation = ",.;:!?";
                boolean haveSymbol = false;
                
                for(int j = 0; j < punctuation.length(); j++)
                {
                    String symbol = String.valueOf(punctuation.charAt(j));
                    if (currentWord.contains(symbol) == true);
                    {
                       haveSymbol = true;
                       currentWord = currentWord.replace(symbol, "");
                       newString.append(currentWord + " ");
                    }
                }
                
            }
           System.out.println("слова, после которых идут знаки пунктуации");
           System.out.println(newString);
           
           String myStr = resultFromFile; 
           StringBuilder newWords = new StringBuilder();
           String word = "";
           for(int i = 0; i < resultFromFile.length(); i++)
           {
               word = word + myStr.charAt(i);
               if(myStr.charAt(i) != ' ' && myStr.charAt(i + 1) == ' ')
               {
                   newWords.append(word + " ");
                   word = "";
               }
           }
           System.out.println("разделение на слова без split");
           System.out.println(newWords);
      }
    }
