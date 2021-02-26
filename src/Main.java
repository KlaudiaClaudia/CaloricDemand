import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Menu menu = new Menu();
        menu.menuFisrts();
        menu.mainMenu();
        menu.choice();
    }



}
