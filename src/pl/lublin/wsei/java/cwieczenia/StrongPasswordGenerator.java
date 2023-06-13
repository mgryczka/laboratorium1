package pl.lublin.wsei.java.cwieczenia;

import java.util.Random;

public class StrongPasswordGenerator {

    private int length = 10;
    private boolean includeLowercase = true;
    private boolean includeUppercase = true;
    private boolean includeNumbers = true;
    private boolean includeSpecialChars = true;
    private String allowedSpecialChars = "!@#$%^&*()_-+=~`[]{}|:;'<>,.?/";

    public StrongPasswordGenerator() {}

    public StrongPasswordGenerator(int length) {
        this.length = length;
    }

    public StrongPasswordGenerator(int length, boolean includeLowercase, boolean includeUppercase,
                                   boolean includeNumbers, boolean includeSpecialChars, String allowedSpecialChars) {
        this.length = length;
        this.includeLowercase = includeLowercase;
        this.includeUppercase = includeUppercase;
        this.includeNumbers = includeNumbers;
        this.includeSpecialChars = includeSpecialChars;
        this.allowedSpecialChars = allowedSpecialChars;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setIncludeLowercase(boolean includeLowercase) {
        this.includeLowercase = includeLowercase;
    }

    public void setIncludeUppercase(boolean includeUppercase) {
        this.includeUppercase = includeUppercase;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }

    public void setIncludeSpecialChars(boolean includeSpecialChars) {
        this.includeSpecialChars = includeSpecialChars;
    }

    public void setAllowedSpecialChars(String allowedSpecialChars) {
        this.allowedSpecialChars = allowedSpecialChars;
    }

    public int getLength() {
        return length;
    }

    public boolean isIncludeLowercase() {
        return includeLowercase;
    }

    public boolean isIncludeUppercase() {
        return includeUppercase;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public boolean isIncludeSpecialChars() {
        return includeSpecialChars;
    }

    public String getAllowedSpecialChars() {
        return allowedSpecialChars;
    }

    public String generate() {
        String password = "";
        String alphabet = "";
        if (includeLowercase) alphabet += "abcdefghijklmnopqrstuvwxyz";
        if (includeUppercase) alphabet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (includeNumbers) alphabet += "0123456789";
        if (includeSpecialChars) alphabet += allowedSpecialChars;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            password += alphabet.charAt(index);
        }
        return password;
    }
}
