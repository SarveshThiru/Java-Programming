import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_]{6,20}$";
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public static boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testUsernames = {
            "validUser123",
            "user_1",
            "123456",
            "invalid-user!",
            "short",
            "thisUsernameIsWayTooLong123"
        };
        for (String username : testUsernames) {
            System.out.println("Username: " + username + " is valid: " + isValidUsername(username));
        }
    }
}
