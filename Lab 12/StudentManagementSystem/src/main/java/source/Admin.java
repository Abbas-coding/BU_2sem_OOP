package source;

public class Admin {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
