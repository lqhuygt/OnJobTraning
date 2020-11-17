package baitap.unit_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KiemTraTamGiacTest {
    @Test
    public void dayLaTamGiac(){
        KiemTraTamGiac isTriangle = new KiemTraTamGiac();
        // kết quả mong đợi trả về
        int expected = 3;
        // kết quả thực khi truyền tham số vào chạy
        int result = isTriangle.kiemTraTamGiac(2,4, 3);
        //hàm so sánh của junit kiểm tra xem kết quả mong đợi và kết quả thực đã khớp chưa?
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void dayLaTamGiacDeu(){
        KiemTraTamGiac isTriangle = new KiemTraTamGiac();
        int expected = 1;
        int result = isTriangle.kiemTraTamGiac(4,4,4);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void dayLaTamGiacCan(){
        KiemTraTamGiac isTriangle = new KiemTraTamGiac();
        int expected = 2;
        int result = isTriangle.kiemTraTamGiac(2,4,4);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void dayKhongPhaiTamGiac(){
        KiemTraTamGiac isTriangle = new KiemTraTamGiac();
        int expected = 4;
        int result = isTriangle.kiemTraTamGiac(4,0,4);
        Assertions.assertEquals(expected, result);
    }
}