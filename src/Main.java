import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.menuFisrts();
        int answear = sc.nextInt();
        calculate.mainMenu();
        if (answear == 1){
            calculate.calcBMR();
        }else if(answear == 2){
            calculate.calcCPM();
        }

    }



}
