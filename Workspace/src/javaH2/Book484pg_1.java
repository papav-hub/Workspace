package javaH2;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Book484pg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
			
			FileWriter fout = null;
			try{
				fout = new FileWriter("c:\\Temp\\phone.txt");
				while(true) {
					System.out.print("�̸� ��ȭ��ȣ >>");
					String line = scanner.nextLine();
					if(line.equals("�׸�")) {
						System.out.println("c:\\Temp\\phone.txt�� �����Ͽ����ϴ�.");
						break;
					}
					fout.write(line, 0, line.length());
					fout.write("\n");
				}
				fout.close();
			}catch (IOException e) {
				System.out.println("����� ����");
			}
			scanner.close();
	}
}