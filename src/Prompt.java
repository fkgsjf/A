import java.util.Scanner;

public class Prompt {

    public int parseFirstDays(String str_firstDays) {
        if (str_firstDays.equals("일")) return 0;
        else if (str_firstDays.equals("월")) return 1;
        else if (str_firstDays.equals("화")) return 2;
        else if (str_firstDays.equals("수")) return 3;
        else if (str_firstDays.equals("목")) return 4;
        else if (str_firstDays.equals("금")) return 5;
        else if (str_firstDays.equals("토")) return 6;
    else {return 0;}
    }

    public void runPrompt() {
        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        int year = 1;
        int firstDays=0;
        while (true) {
            System.out.println("년을 입력하세요");
            System.out.println("Year> ");
            year = scan.nextInt();
            System.out.println("달을 입력하세요");
            System.out.print("Month> ");
            month = scan.nextInt();
            System.out.println("첫번째 요일을 입력하세요. (일, 월, 화, 수, 목, 금, 토)");
            System.out.print("days> ");
            String str_firstDays = scan.next();
            firstDays= parseFirstDays(str_firstDays);
            if (month <1 || month > 12 ) {
                System.out.println("달을 잘못 입력하였습니다. 다시 입력해 주세요.");
                continue;
            } else if (year<1) {
                System.out.println("연도를 잘못 입력하였습니다. 작업을 끝냅니다");
                break;
            } else {
                cal.printCalendar(year, month, firstDays);
            }
        }
        System.out.println("have a nice day!");
        scan.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();


    }
}
