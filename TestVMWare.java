import java.util.Scanner;

public class TestVMWare {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double w = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double height = (h * 100) - 100;
        int workingPlaceHeight = 120;
        int workingPlaceWidth = 70;

        double oddWidth = (w * 100) % workingPlaceWidth;
        double evenWidth = (w - (w * 100) % workingPlaceWidth) ;
        double oddHeight = height % workingPlaceHeight;
        double evenHeight = (h - height % workingPlaceHeight) ;







    }
}
