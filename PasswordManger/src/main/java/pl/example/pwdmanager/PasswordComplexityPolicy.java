package pl.example.pwdmanager;

public class PasswordComplexityPolicy {

    private static final int MIN_LENGHT = 8;
    private static final int MIN_DIGITS = 3;

    public boolean verify (String password){

        int pwdLenght = password.length();
        int digitCount = 0;
        for (int i = 0; i < pwdLenght ; i++) {
            if (Character.isDigit(password.charAt(i))){
                digitCount++;
            }
        }
        boolean result = true;
        if (pwdLenght<MIN_LENGHT)
            result = false;
        if (digitCount<MIN_DIGITS)
            result = false;
        return result;

    }
}
