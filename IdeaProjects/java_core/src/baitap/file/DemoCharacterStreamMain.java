package baitap.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// lớp đề mô lưu file dạng Unicode
public class DemoCharacterStreamMain {
	public static void main(String[] args) throws IOException {
		writeFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt", "chào mừng bạn");
		String kq = readFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
		System.out.println(kq);
		
		System.out.println("Số từ trong file là "+demWordFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt"));
	}
	// Hàm đọc file
	public static String readFile(String filePath) throws IOException {
		String output = "";
		FileReader fileInput = new FileReader(filePath);
		int i;
		while ((i= fileInput.read()) != -1) {
			output += (char)i;
		}
		return output;
	}
	
	// Hàm ghi file
	public static void writeFile(String filePath, String input) throws IOException {
		// Khởi tạo 1 đối tượng writer từ lớp FileWriter, giá trị truyền vào là filePath
		FileWriter writer = new FileWriter(filePath); 
		writer.write(input); // dùng hàm write để ghi giá trị input vào filePath
		writer.close(); 
	}
	
	// Hàm đếm số từ trong file dạng đơn giản
	public static int demWordFile(String filePath) throws IOException {
		String str = readFile(filePath);
		String[] array = str.split(" ");
		int dem = array.length;
		return dem;
	}
}
