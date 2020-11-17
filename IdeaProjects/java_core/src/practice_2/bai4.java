package practice_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai4 {
    /*
        Tao ngau nhien bang a[N] gom cac so nguyen roi sau do thuc hien:
        - Sap xep day a theo thu tu tang dan.
        - loai bo bot cac phan tu trung nhau sao cho moi gia tri chi
            xuat hien trong a duy nhat 1 lan.
     */

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        Random random = new Random();
        int count = 0;
        while(count < n){ 
            arr[count++] = random.nextInt(100);
        }
        
        int [] brr = new int[n];
        int bSize = 0;
        boolean isExist = false;
        for (int i = 0; i < n; i++) {
            isExist = false;
            for (int j = 0; j < bSize; j++) {
                if(arr[i] == brr[j]){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                brr[bSize++] = arr[i];
            }
        }
        System.out.println("Truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep");
        System.out.println(Arrays.toString(arr));

        brr = Arrays.copyOfRange(brr, 0, bSize);
        Arrays.sort(brr); // cat bo cac phan tu du thua
        System.out.println("Mang chi chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(brr));
    }
}
