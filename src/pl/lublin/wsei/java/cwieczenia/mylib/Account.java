package pl.lublin.wsei.java.cwieczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String[] translitRepl = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String capitalize() {
        return StringUtils.capitalize(name);
    }

    public String initials() {
        String[] parts = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part.charAt(0));
        }
        return sb.toString();
    }

    public String translit(String arg) {
        arg = arg.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arg.length(); i++) {
            int index = ukrAlphabet.indexOf(arg.charAt(i));
            if (index == -1) {
                sb.append(arg.charAt(i));
            } else {
                sb.append(translitRepl[index]);
            }
        }
        return sb.toString();
    }
}
