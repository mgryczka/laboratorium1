package pl.lublin.wsei.java.cwieczenia;

import pl.lublin.wsei.java.cwieczenia.mylib.StringFun;

public class decamelizeTest {
    public static void main(String[] args) {
        String[] testCases = {"test", "testowyTekst", "Test1Test2", "  AbC  DeF  Ghi  "};

        for (String tekst : testCases) {
            System.out.println("Przed: " + tekst);
            String result = StringFun.decamelize(tekst);
            System.out.println("Po: " + result);
        }
    }
}
