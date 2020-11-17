package baitap.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// lớp đè mô file buffe tối ưu hóa thời gian chạy và dung lượng ổ cứng
public class DemoBufferStreamMain {
	public static void main(String[] args) throws IOException {
		String output = "Chào các bạn, \r \n Tôi là máy tính!";
		writeFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt",output);
		String kq = readFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
		System.out.println(kq);
	}
	// Hàm ghi file
	public static void writeFile(String filePath, String output) throws IOException {
		FileWriter fwt = new FileWriter(filePath);
		BufferedWriter writer = new BufferedWriter(fwt);
		writer.write(output); // ghi vào bộ nhớ đệm
		writer.close(); // ở filebuffe nếu ko có lệnh này thì nó sẽ ko thực hiện ghi giá trị output vào file
	}
	
	// Hàm đọc file
	public static String readFile(String filePath) throws IOException {
		String kq = "";
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String temp ="";
		while( (temp = reader.readLine())!= null) {
			kq = kq + temp + "\n";
		}
		return kq;
		
	}
}
