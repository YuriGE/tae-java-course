/* @author <Yuri Kirkitadze> */

package homework5;

public class PasswordChecker {
    public static void main(String[] args) {
        String pass1 = "123";
        String pass2 = "ABCabc1";
        String pass3 = "ABCabc12";
        System.out.println("pass1 isStrong? -> " + isStrong(pass1));
        System.out.println("pass2 isStrong? -> " + isStrong(pass2));
        System.out.println("pass3 isStrong? -> " + isStrong(pass3));

    }

    public static boolean isStrong(String password) {
        if (password.length() < 8)
            return false;
        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                hasDigit = true;
            if (Character.isUpperCase(ch))
                hasUpper = true;
        }
        return hasDigit && hasUpper;
    }
}
