package Session_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS5_G1 {
    public static final String PASS_WORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%])[A-Za-z\\d@#$!%]{8,}$";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập vào mật khẩu: ");
        String PassWord =  sc.nextLine();

        Pattern pattern = Pattern.compile(PASS_WORD);
        Matcher matcher = pattern.matcher(PassWord);

        if (matcher.matches()){
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

    }
}
