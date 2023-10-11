import java.util.Scanner;

public class Gugudanmain {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        String inputValue = scan.nextLine();
    System.out.println("숫자 두개 입력");
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
    int[] result = Do.calculate(first);
    Do.print(result);
        Do.power(scanNumber);
}
}