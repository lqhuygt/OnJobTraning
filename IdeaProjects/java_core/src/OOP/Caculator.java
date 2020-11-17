package OOP;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberFirst;
        int numberSecond;
        String caculate;
        int result = 0;

        System.out.println("numberFirst:" );
        numberFirst = scanner.nextInt();
        scanner.nextLine();

        System.out.println("caculate:");
        caculate = scanner.nextLine();

        System.out.println("numberSecond:" );
        numberSecond = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        System.out.println("numberFirst:" + numberFirst );
        System.out.println("caculate:"+ caculate );
        System.out.println("numberSecond:" + numberSecond);

        switch (caculate){
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
            case "x":
                result = numberFirst * numberSecond;
                break;
            case "/":
            case ":":
                result = numberFirst / numberSecond;
            case "%":
                result = numberFirst % numberSecond;
                break;
            default:
                if(caculate != "+" || caculate != "-" ||caculate != "*" || caculate != "/"||
                        caculate != "%" ||caculate != "x" || caculate != ":"){
                    System.out.println("Nhap lai caculate!");
                }
                break;
        }
        System.out.println("----------------------------");
        System.out.printf("%d %s %d = %d", numberFirst,caculate,numberSecond,result);
    }
}
