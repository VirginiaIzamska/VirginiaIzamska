import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hourExam = Integer.parseInt(sc.nextLine());
        int minExam = Integer.parseInt(sc.nextLine());
        int hourArrive = Integer.parseInt(sc.nextLine());
        int minArrive = Integer.parseInt(sc.nextLine());

        int allHourExam = hourExam*100 + minExam;
        int allHourArrive = hourArrive*100 + minArrive;

        int mins = minArrive - minExam;
        int hour = Math.abs(hourArrive - hourExam);

        if (allHourExam < allHourArrive){
            System.out.printf("Late\n", allHourArrive  - allHourExam );
            if (hour >= 1) {
                System.out.printf("%d:%d minutes after the start\n",hour,mins);
            } else {
                System.out.printf("%d minutes after the start\n", mins);
            }
        } else if (allHourArrive == allHourExam || (mins == 30)){
            System.out.printf("On time\n", allHourArrive  - allHourExam);

            if (hour >= 1){
                System.out.printf("%d:%d minutes after the start\n", hour, mins);
            } else {
                System.out.printf("%d minutes after the start\n", mins);
            }
        } else {
            System.out.printf("Early\n", allHourExam  - allHourArrive);
            if (hour >= 1){
                System.out.printf("%d:%d minutes after the start\n", hour, mins);

            } else {
                System.out.printf("%d minutes after the start\n", mins);
            }
        }


    }
}


