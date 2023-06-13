package pl.lublin.wsei.java.cwieczenia;

import pl.lublin.wsei.java.cwieczenia.mylib.StringFun;

import java.util.Scanner;

public class anarchizeTest {
    public static void main(String[] args) {
        String[] texts = {"No pAsSaRaNt", "To jEsT tEsT", "JAKIS TEKST", "teXt Z mAlEj LiTeRY", "BezLITery"};
        for (String text : texts) {
            System.out.println("Przed: " + text);
            String result = StringFun.anarchize(text);
            System.out.println("Po: " + result);
        }
    }
}