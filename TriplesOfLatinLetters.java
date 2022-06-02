

import java.util.Scanner;

public class TriplesOfLatinLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numToString = input.split("\\s+");
        int[] numbers = new int[numToString.length];
        for (int i = 0; i < numToString.length; i++) {
            numbers[i] = Integer.parseInt(numToString[i]);
        }
//        int continueJ = 0;
        boolean isValid = false;
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            leftSum += numbers[i];
            if (numbers.length <= 1) {
                System.out.println("0");
                break;
            }
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (j == numbers.length - 1) {
                    rightSum = 0;
                }
                if (rightSum < leftSum) {
                    rightSum += numbers[j];
                }
                if (i == numbers.length - 1
                        && j == 0
                        && leftSum != rightSum) {
                    System.out.println("no");
                }

                if (leftSum == rightSum
                        && numbers[i] + numbers[j] < numbers.length) {
                    //if (j - i > 1) {
                    System.out.println(i + 1);

                    //break;
                    //}
                    //System.out.println(i);
                    isValid = true;
                    break;
                }

                if (j == 0) {
                    break;
                }
//                if (j == 0 && i < numbers.length - 1) {
//                    continueJ = numbers[j];
//                }
            }
            if (isValid) {
                break;
            }
        }

    }
}

