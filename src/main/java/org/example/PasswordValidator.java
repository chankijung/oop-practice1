package org.example;

public class PasswordValidator {

    public static final String wrong_password_length_message = "비밀번호는 최소 8글자 이상 12글자 이하여야 한다.";

    public static void validate(String password) {
        int length = password.length();
        if(length <8|| length >12){
            throw new IllegalArgumentException(wrong_password_length_message);

        }

    }
}
