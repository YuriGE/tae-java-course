/* @author <Yuri Kirkitadze> */

package homework5;

import org.jetbrains.annotations.NotNull;

public class VowelCounter {
    public static void main(String[] args) {

        String fullName = "Yuri Kirkitadze";
        System.out.println("Name: " + fullName + " has " + countVowels(fullName) + " Vowels");

    }

    public static int countVowels(@NotNull String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break; //ამის გარეშეც სწორედ იმუშავებს
            }

        }
        return counter;
    }
}
