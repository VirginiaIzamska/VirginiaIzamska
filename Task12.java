import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int i = 0; i < arr.length; i++){
            int currentlement =  arr[i];
            boolean isBiggerThan = true;
            for (int j = i+1; j < arr.length; j++){

                if (currentlement <= arr[j]){
                    isBiggerThan = false;
                }

            }
            if (isBiggerThan){
                System.out.print(currentlement + " ");
            }
        }




    }

}

