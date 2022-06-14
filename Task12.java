import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++){
            String firstElement = arr[0];

            for (int j = 0; j < arr.length -1; j++){
                arr[j] = arr[j + 1];

            }
            arr[arr.length -1] = firstElement;
        }

        for (String item : arr){
            System.out.print(item + " ");
        }

    }

}

