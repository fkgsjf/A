import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1, s2;
        s1 = scan.next();
        s2 = scan.next();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        System.out.println(a + "," + b);
        //System.out.println("두 수의 합은 " + (a + b) + "입니다");
        System.out.printf("%d와 %d의 합은 %d입니다",a,b, a+b);
        scan.close();
    }
}

