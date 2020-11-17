package practice_1;



public class Bai4 {
    /*
    Viet chương trinh in bang cuu chương
     */
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for (int j = 0; j <=10 ; j++) {
                System.out.printf(" %2d x %d = %2d", i , j, i*j);
            }
            System.out.println();
        }

    }

}