import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_REGEX =   "^\\d{2}-0\\d{9}$";
    public ValidatePhone(){}

    public boolean validate(String regex){
        return Pattern.matches(PHONE_REGEX, regex);
    }
}
