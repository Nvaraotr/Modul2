import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<String>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));

        ArrayList<String> DeleteHewan = new ArrayList<String>(Arrays.asList("Kelinci", "Kambing", "Unta"));
        
        System.out.print("Hewan:");
        for (String print : Hewan) {
            System.out.print(print+ ",");
        }

        System.out.print("Hewan yang Dihapus:");
        for (String print : DeleteHewan) {
            System.out.print(print+ ",");
        }
        

        Hewan.removeAll(DeleteHewan);

        System.out.print("\nOutput Hewan: ");
        for (String print : Hewan) {
            System.out.print(print + ",");
        }
    }
}