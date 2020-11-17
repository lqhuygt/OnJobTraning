package practice_2;

import java.util.Scanner;

public class bai2 {
    /*
        Doc vao mot day so a co n phan tu la so nguyen. Dem so lan xuat hien
        cua tung phan tu trong mang. in ra phan tu va so lan xuat hien cua phan tu
        co so lan xuat hien nhieu nhat trong a
     */
    public static void main(String[] args) {
        int n,count;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr,res;
        arr = new int[n];
        res = new int[n];
        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            res[i] = -1;
        }

        //dem so lan xuat hien cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            count=1;
            for (int j = i+1; j < n; j++) {
                if(res[j]!=0 && arr[i]==arr[j]){
                    count++;
                    res[j]=0;
                }
            }
            if(res[i]!=0){
                res[i]=count;
            }
        }
        // tim so lan xuat hien nhieu nhat
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if(res[i]>max){
                max= res[i];
            }
        }
        //xuat ket qua
        System.out.print("so lan xuat hien nhieu nhat la: " + max + " va cac phan tu thoa man: ");
        for (int i = 0; i < n; i++) {
            if(res[i]==max){
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("\b\b");
    }
}
