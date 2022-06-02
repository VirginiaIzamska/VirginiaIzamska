import java.util.Scanner;

public class Task1NestedLoopsExcer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int counter = 1;
        boolean isCurrent = false;
        for (int rows = 1; rows <= n; rows++){
            for (int cols = 1; cols <= rows; cols += 1) {
                if (counter > n) {
                    isCurrent = true;
                    break;
                }
                System.out.print(counter + " ");
                counter++;
            }
            if (isCurrent){
                break;
            }
            System.out.println();

        }

    }
}
