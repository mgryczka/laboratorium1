package pl.lublin.wsei.java.cwieczenia;

import pl.lublin.wsei.java.cwieczenia.mylib.StringFun;

public class CamelizeTest {
    public static void main(String[] args) {
        String text1 = "Krótka zabawna funkcja";
        String text2 = "KRÓTKA zabawna Funkcja";
        String text3 = "   krótka zabawna    funkcja   ";

        String result1 = StringFun.camelize(text1);
        String result2 = StringFun.camelize(text2);
        String result3 = StringFun.camelize(text3);

        System.out.println(text1 + " => " + result1);
        System.out.println(text2 + " => " + result2);
        System.out.println(text3 + " => " + result3);
    }
}
