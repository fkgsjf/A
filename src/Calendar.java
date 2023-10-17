import java.util.Scanner;

public class Calendar {

    final protected int[] maxDays = {31, 28,31,30,31,30,31,31,30,31,30,31};

    public int getMaxDaysOfMonth(int month) {

        return maxDays[month-1];

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("반복 횟수를 입력하세요");
        int repeat = scan.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.println("달을 입력하세요");
            int month = scan.nextInt();
            System.out.printf("%d월은 %d일까지 있습니다%n", month, cal.getMaxDaysOfMonth(month));
        }
        System.out.println("끝");
        scan.close();
    }

}