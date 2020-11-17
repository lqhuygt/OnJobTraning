package practice_1;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    /*
        viet chuong trinh nhap so nguyen trong khoang 0-100
        lan luot lay cac so ngau nhien trong trong khoang nay cho den khi co mot gia tri dung bang
        gia tri nhap vao. In ra tung buoc va so buoc thuc hien
     */
    public static void main(String[] args) {
        int input, count = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        Random random = new Random();
        while (true){
            int ranNumber = random.nextInt(100); // [0-99]
            count++;
            System.out.println("random Number: " + ranNumber + " , input: " + input);
            if(ranNumber == input){
                System.out.println("thuc hien: " + count + " lan");
                break;
            }
        }
    }
}
