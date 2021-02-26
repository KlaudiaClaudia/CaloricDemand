import java.util.Scanner;

import static java.lang.Math.round;

public class Calculate {
    private double weight,height,age,factor,BMR,CPM;
    private String male;
    Scanner sc = new Scanner(System.in);

    public Calculate() {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.factor = factor;
        this.BMR = BMR;
        this.CPM = CPM;
        this.male = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getBMR() {
        return BMR;
    }

    public void setBMR(double BMR) {
        this.BMR = BMR;
    }

    public double getCPM() {
        return CPM;
    }

    public void setCPM(double CPM) {
        this.CPM = CPM;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public double calcBMR(){
        if (male.equals("M")) {
            BMR = (66.5 + (13.7 * weight) + (5 * height) - (6.8 * age));
        }else if(male.equals("K")) {
            BMR = (655 + (9.6 * weight) + (1.85 * height) - (4.7 * age));
        }
        System.out.println("Twoje podstawowe zapotrzebowanie kaloryczne wynosi: "+round(BMR) + " kcal.");
        return BMR;
    }
    public double calcCPM(){
        System.out.println("Podaj współczynnik aktywności: ");
        factorMenu();
        factor = sc.nextDouble();
        calcBMR();
        CPM = BMR * factor;
        System.out.println("Twoje zapotrzebowanie kaloryczne przy wybranej aktywności wynosi: " + round(CPM) + " kcal.");
      return CPM;
    }
    public void factorMenu(){
        System.out.println("\n1,0  -> tryb życia leżący, siedzący, brak aktywności fizycznej");
        System.out.println("1,2  -> praca siedząca, aktywność fizyczna na niskim poziomie");
        System.out.println("1,4  -> praca nie fizyczna, treningi 2 razy w tygodniu");
        System.out.println("1,6  -> lekka praca fizyczna, treningi 3-4 razy w tygodniu");
        System.out.println("1,8  -> praca fizyczna, treningi 5 razy w tygodniu");
        System.out.println("2,0  -> ciężka praca fizyczna, codzienne treningi");
    }

}
