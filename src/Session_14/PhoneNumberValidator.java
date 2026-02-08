package Session_14;

public class PhoneNumberValidator {
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberLengthException {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại không được để trống");
        }

        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại chỉ chứa chữ số");
        }

        if (phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại phải có đúng 10 chữ số");
        }
    }
}
