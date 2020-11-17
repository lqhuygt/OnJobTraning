package baitap.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// lớp đề mô file ghi dữ liệu dạng int, double, ... nhiều kiểu dữ liệu
public class DemoDataStreamMain {
	public static void main(String[] args) throws IOException {
		writeFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
		readFile("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
	}
	// Hàm ghi file
	public static void writeFile(String filePath) throws IOException {
		// Khi khởi tạo dòng này sẽ phải thêm 2 thư viện cho class và thêm throws FileNotFoundException cho hàm
		DataOutputStream output = new DataOutputStream(new FileOutputStream(filePath));
		// Khởi tạo 3 mảng vs 3 kiểu dữ liệu
		Double[] gia = new Double[] {10.1,20.3, 30.5};
		int[] soluong = new int[] {1,2,3};
		String[] mota = new String[] {"quần áo","giày dép","sách vở"};
		for(int i=0; i< 3; i++) {
			output.writeUTF(mota[i]); // dùng hàm writeUTF để ghi giá trị kiểu STring
			output.writeDouble(gia[i]); //dùng hàm writeDouble để ghi giá trị kiểu Double
			output.writeInt(soluong[i]); //dùng hàm writeInt để ghi giá trị kiểu Int
		}
		output.close();
	}
	
	// Hàm đọc file
	public static void readFile(String filePath) throws IOException {
		DataInputStream inputFile = new DataInputStream(new FileInputStream(filePath));
		try {
			while (true) {
				String mota = inputFile.readUTF();
				Double gia = inputFile.readDouble();
				int soluong = inputFile.readInt();
				System.out.println("mota: " + mota + ", don gia: " + gia + ", soluong: " + soluong);
			}
		} catch (EOFException e) {
			System.out.println("Hết file");
		}
	}
	

	
}
