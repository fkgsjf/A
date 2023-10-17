

public class Calendar {

    final protected int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {

        return maxDays[month - 1];

    }

    public void printCalendar(int year, int month, int firstDays) {
        System.out.printf("   <<%d년, %d월 달력>>\n", year, month);
        String[] days = new String[] {"일","월","화","수","목","금","토"};
        for (int k = 0; k < days.length; k++) {
            System.out.printf("%3s", days[k]);
        }
        System.out.println("");
        System.out.println("---------------------");
        int max = getMaxDaysOfMonth(month);
        if(month == 2 && (year%4==0 && ( year%100 !=0 || year%400==0 )))
        { max = 29;}
        for (int i = 0; i < firstDays; i++) {
            System.out.printf("   ");

        }
            for (int i = 1; i <= max; i++) {
                 System.out.printf("%3d", i);
                if ((i+firstDays) % 7 == 0) {
                    System.out.println("");
                }
             }

        System.out.println("");
        System.out.println("");
    }
}




