package javaH2;

import java.io.*;

public class Ex8_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int c;
		try {
			BufferedOutputStream fi = new BufferedOutputStream(System.out, 20);
			FileReader fo = new FileReader("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			int c1;
			while((c1 = fo.read()) != -1) {
				fi.write((byte)c1);
			}
			fi.close();
			fo.close();
			System.out.println("완료");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
