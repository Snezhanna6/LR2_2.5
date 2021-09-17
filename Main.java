package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static String inputStr;

    public static void main(String[] args) {
        setInputStr();
        System.out.println(searchTask(inputStr));
    }

    //Метод для ввода строки с консоли
    private static void setInputStr(){

        System.out.print("Ввод строки:");
        inputStr = new Scanner(System.in).nextLine();
    }

    //Метод для поиска в строке подстроки "aa" или "00"
    public static String searchTask(String str){

        Pattern p = Pattern.compile(".*aa.*||.*00.*");
        Matcher m = p.matcher(str);

        while (m.matches()){
            return "YES";
        }

        return "NO";
    }
}
