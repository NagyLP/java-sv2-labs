package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername (String username) {
        return !"".equals(username) &&  username.length() > 1;
    }

    public boolean  isValidPassword (String password1, String password2) {
        return password1.length() < 8
            && password1.equals(password2);
    }

    public boolean isValidEmail (String email) {
        int atIndexEmail = email.indexOf("@");
        String emailAdress = email.substring(atIndexEmail+1);
        int dotEmailAdressIndex = emailAdress.indexOf(".");
        return atIndexEmail >= 2 &&
                dotEmailAdressIndex > 0 &&
                dotEmailAdressIndex < emailAdress.length()-1;
    }

}
