import java.util.Locale;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupPeople = Integer.parseInt(sc.nextLine());
        String typeGroup = sc.nextLine().toLowerCase(Locale.ROOT);
        String dayOfWeek = sc.nextLine().toLowerCase(Locale.ROOT);

        double totalPrice = 0;
        switch (typeGroup) {
            case "students":

                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = groupPeople * 8.45;
                        break;
                    case "saturday":
                        totalPrice = groupPeople * 9.80;
                        break;
                    case "sunday":
                        totalPrice = groupPeople * 10.46;
                        break;
                    default:
                        System.out.println("Invalid day.");
                        break;
                }
                break;
            case "business":
                if (100<=groupPeople){
                    groupPeople=groupPeople-10;
                }
                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = groupPeople * 10.90;
                        break;
                    case "saturday":
                        totalPrice = groupPeople * 15.60;
                        break;
                    case "sunday":
                        totalPrice = groupPeople * 16.00;
                        break;
                    default:
                        System.out.println("Invalid day.");
                        break;
                }
                break;
            case "regular":
                switch (dayOfWeek) {
                    case "friday":
                        totalPrice = groupPeople * 15.00;
                        break;
                    case "saturday":
                        totalPrice = groupPeople * 20.00;
                        break;
                    case "sunday":
                        totalPrice = groupPeople * 22.50;
                        break;
                    default:
                        System.out.println("Invalid day.");
                }
                break;
            default:
                System.out.println("Invalid group.");
                break;
        }


        if(typeGroup.equals("students") && (30<=groupPeople)){
            totalPrice=totalPrice- (totalPrice*0.15);
        }
        if(typeGroup.equals("regular") && (10<=groupPeople && groupPeople<=20)){
            totalPrice=totalPrice- (totalPrice*0.05);
        }

        System.out.printf("Total price: %.2f",totalPrice);

    }
}

