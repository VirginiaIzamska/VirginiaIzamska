import java.util.Scanner;

public class TestNesteedLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStore = Integer.parseInt(sc.nextLine());
        int numberOfRooms = Integer.parseInt(sc.nextLine());

        char appartment = 'A';
        char office = 'O';
        char appLarge = 'L';

        for (int i = numberOfStore; i > 0; i--) {
            System.out.println("");
            if (i % 2 == 0) {
                for (int j = 0; j < numberOfRooms; j++) {
                    if (numberOfStore == i) {
                        System.out.printf("%c%d%d ", appLarge, i, j);
                    } else {
                        System.out.printf("%c%d%d ", office, i, j);
                    }
                }
            } else {
                for (int f = 0; f < numberOfRooms; f++){
                    if (numberOfStore == i){
                        System.out.printf("%c%d%d ", appLarge, i, f);
                    } else {
                        System.out.printf("%c%d%d ", appartment, i, f);
                    }

                }
            }
        }
    }
}
