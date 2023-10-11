import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1, s2;
        s1 = scan.next();
        int a = Integer.parseInt(s1);
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.printf("%d월은 \n%d일까지 있습니다", a, month[a-1]);
        scan.close();


    }
}

