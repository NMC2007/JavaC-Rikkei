package Session_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS5_k1 {
    public static final String REGEX_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập vào email: ");
        String Email =  sc.nextLine();

        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(Email.toUpperCase());

        System.out.println(matcher.matches());
    }
}
