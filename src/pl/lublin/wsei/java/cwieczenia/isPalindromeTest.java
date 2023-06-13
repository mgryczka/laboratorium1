package pl.lublin.wsei.java.cwieczenia;

import pl.lublin.wsei.java.cwieczenia.mylib.StringFun;

import java.util.Scanner;

public class isPalindromeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Podaj napis do sprawdzenia czy jest palindromem: ");
        String napis = scn.nextLine();
        boolean wynik = StringFun.isPalindrome(napis);
        if(wynik) {
            System.out.println("Napis \"" + napis + "\" jest palindromem.");
        } else {
            System.out.println("Napis \"" + napis + "\" nie jest palindromem.");
        }
    }
}


