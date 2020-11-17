package com.ljava1906e;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// viết program in ra 20 năm nhuận tiếp theo (lấy  năm hiện tại làm mặc định)
public class bt1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer year = scanner.nextInt();
        if (year == null){
            year = new Date().getYear();
        }
        List result = new ArrayList();
        while (result.size() <= 20){
            if (year%4 == 0 && year%100 != 0){
                result.add(year);
            }
            year++;
        }
        System.out.print(result);
    }
}
