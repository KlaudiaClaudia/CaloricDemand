public class Menu extends Calculate{
    private int answear ;
    public void mainMenu(){
        System.out.println("Podaj wagę: ");
        setWeight(sc.nextInt());
        System.out.println("Podaj wzrost: ");
        setHeight(sc.nextInt());
        System.out.println("Podaj swój wiek: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Podaj czy jesteś kobieta (K) lub mężczyzną (M): ");
        setMale(sc.nextLine());
    }
    public void menuFisrts(){
        System.out.println("Witaj w kalkulaotrze zapotrzebowania kalorycznego!");
        System.out.println("1. Oblicz podstawowe zapotrzebowanie");
        System.out.println("2. Oblicz dzienne zapotrzebowanie");
        answear = sc.nextInt();
    }
    public void choice(){
        if (answear == 1){
            calcBMR();
        }else if(answear == 2){
            calcCPM();
        }
    }
}
