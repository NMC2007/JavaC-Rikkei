package Session_17.SS17K1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        run(sc);
    }

    private static void run(Scanner sc) {
        MovieMenu.showMenu(sc);
    }
}
