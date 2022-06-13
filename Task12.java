import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for (int i = 0; i < n; i ++) {
            int firstNum;
            int secondNum;
            if (i % 2 == 0) {
                firstNum = sc.nextInt();
                firstArr[i] = firstNum;
                 secondNum = sc.nextInt();
                secondArr[i] = secondNum;
            } else {

                firstNum = sc.nextInt();
                secondArr[i] = firstNum;
                secondNum = sc.nextInt();
                firstArr[i] = secondNum;
            }


        }


       for (int item : firstArr){
           System.out.print(item + " ");
       }
        System.out.println();
        for (int item : secondArr){
            System.out.print(item + " ");
        }


    }

}

