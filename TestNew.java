import java.util.Scanner;

public class TestNew {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budjet = scan.nextDouble();
        int people = scan.nextInt();
        double pricePerPerson = scan.nextDouble();

        double decor = budjet - (budjet * 0.1);
        double pricePerAll = pricePerPerson * people;
        double sum = 0;

        if (people > 150) {
            pricePerAll = pricePerAll - (pricePerAll * 0.1);
            sum = pricePerAll + decor;
        }
        if (sum > budjet) {
            sum = sum - budjet;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", sum);
        }







    }
}





