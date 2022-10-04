import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public ArrayList<State> readFile(String filename) {
        ArrayList<State> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));
            sc.useDelimiter("\\r\\n|\\t");
            while (sc.hasNextLine()) {
                String shortcut = sc.next();
                String name = sc.next();
                double VAT = sc.nextDouble();
                double lowVAT = sc.nextDouble();
                boolean parkingRate = sc.nextBoolean();
                list.add(new State(shortcut, name, VAT, lowVAT, parkingRate));
            }
        } catch (Exception ex) {
            System.err.println("Error while reading file: " + filename + "!");
            System.err.println("Error message: " + ex.getLocalizedMessage());
        }
        return list;
    }
    public void findStatesByVAT(ArrayList<State> list, double VAT){
       for (State state : list) {
           if (state.VAT > VAT) {
            System.out.println(state.name + " (" + state.VAT + " %)");
            }
       }
    }

}
