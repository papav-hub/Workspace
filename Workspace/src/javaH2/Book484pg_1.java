package javaH2;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Book484pg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
			
			FileWriter fout = null;
			try{
				fout = new FileWriter("c:\\Temp\\phone.txt");
				while(true) {
					System.out.print("이름 전화번호 >>");
					String line = scanner.nextLine();
					if(line.equals("그만")) {
						System.out.println("c:\\Temp\\phone.txt에 저장하였습니다.");
						break;
					}
					fout.write(line, 0, line.length());
					fout.write("\n");
				}
				fout.close();
			}catch (IOException e) {
				System.out.println("입출력 오류");
			}
			scanner.close();
	}
}