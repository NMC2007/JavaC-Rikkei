package Session_13.SS13_XS1.presentation;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
    }

    private static void run(Scanner sc) {
        StudentView.showMenu(sc);
    }
}
