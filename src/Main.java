import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidatePhone validatePhone = new ValidatePhone();
        System.out.println("Nhập vào số điện thoại : ");
        String phoneNumber = scanner.nextLine();
        System.out.println(phoneNumber + " is " + validatePhone.validate(phoneNumber));
    }
}
