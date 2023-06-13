package pl.lublin.wsei.java.cwieczenia;

import pl.lublin.wsei.java.cwieczenia.mylib.StringFun;

public class shuffleTest {
    public static void main(String[] args) {
        String[] testCases = {"Ala ma kota", "Kobyła ma mały bok ", "Test1Test2", "ABCDEFG"};
        for (String tekst : testCases) {
            System.out.println("Przed: " + tekst);
            String result = StringFun.shuffle(tekst);
            System.out.println("Po: " + result);
        }
    }
}
