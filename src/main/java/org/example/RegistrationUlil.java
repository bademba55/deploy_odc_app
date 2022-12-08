package org.example;

public class RegistrationUlil {
    boolean validateUserInput(String username, String password, String confirpassword) {
        if (username.isEmpty() || password.isEmpty() || confirpassword.isEmpty()) {
            return false;
        }
        return password.equals(confirpassword);
    }
}


