import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyEmailValidator {
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern eMailPattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

    private Matcher matcher;

    public boolean isValidEmail(String email) {
        matcher = eMailPattern.matcher(email);
        return matcher.matches();
    }
}
