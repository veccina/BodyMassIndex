import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height;
        double weight;
        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter your height(in meters) : ");
        height = inp.nextDouble();
        System.out.println(" Enter your weight (in kilograms) : ");
        weight = inp.nextDouble();
        double mass = (weight / (height * height) );
        System.out.println(" Body Mass Index :" + mass );
    }
}