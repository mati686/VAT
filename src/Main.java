import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileReader states = new FileReader();
        ArrayList<State> list = states.readFile("vat-eu.csv");
        System.out.println("Zadej velikost daně: ");
        Scanner input = new Scanner(System.in);
        double filterVAT = input.nextDouble();
        System.out.println("Zadaná daň je: "+filterVAT+"%");
        System.out.println("Země s minimální daní "+filterVAT+"%:");
        states.findStatesByVAT(list, filterVAT);
    }
}