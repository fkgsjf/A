public class Do {

    public static int[] calculate(int number, int number2) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }


    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    public static int power(int number) {
        int result=number*number;
        System.out.println(result);
        return result;
    }

    public static int



    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i+"단");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//
//            }
//            System.out.println("");
//        }

//        System.out.println("출력할 단에 해당하는 숫자를 입력하세요.");
//        Scanner scan = new Scanner(System.in);
//        int scanNumber = scan.nextInt();
//        System.out.println("당신이 입력한 값="+scanNumber+System.lineSeparator());
//
//        if(scanNumber>9){
//            System.out.println("9보다 작은 값만 입력할 수 있습니다.");
//            }
//            else if(scanNumber<2){System.out.println("2보다 큰 값만 입력할 수 있습니다.");}
//        else {
//            System.out.println(scanNumber + "단의 구구단 결과는 ");
//            int i = 1;
//            while (i < 10) {
//                int result = scanNumber * i;
//
//                System.out.println(scanNumber + "*" + i + "=" + result);
//                i++;
//            }
//        }

        }

    }

