package pl.lublin.wsei.java.cwieczenia;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) {
        StrongPasswordGenerator passwordGenerator = new StrongPasswordGenerator();
        System.out.println(passwordGenerator.generate());

        StrongPasswordGenerator passwordGenerator2 = new StrongPasswordGenerator
                (15, false, true, true, false, "");
        System.out.println(passwordGenerator2.generate());

        StrongPasswordGenerator passwordGenerator3 = new StrongPasswordGenerator
                (20, true, true, true, true, "!@#$%");
        System.out.println(passwordGenerator3.generate());
    }
}
