package Session_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SS14_G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào các số điện thoại:");
        String phoneNumber = sc.nextLine();

        List<String> validPhoneNumbers = new ArrayList<>();

        List<String> invalidPhoneNumbers = new ArrayList<>();

        String[] phones = phoneNumber.split(",");

        for (String phone : phones) {
            phone = phone.trim();

            try {
                PhoneNumberValidator.validatePhoneNumber(phone);
                validPhoneNumbers.add(phone);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhoneNumbers.add(phone + ": " + e.getMessage());
            }
        }


        System.out.println("Số điện thoại hợp lệ:");
        for (String phone : validPhoneNumbers) {
            System.out.println(" - " + phone);
        }

        System.out.println("Số điện thoại không hợp lệ:");
        for (String phone : invalidPhoneNumbers) {
            System.out.println(" - " + phone);
        }
    }
}
