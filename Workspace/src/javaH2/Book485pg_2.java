package javaH2;

import java.io.*;
import java.util.*;

public class Book485pg_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("c:\\Temp\\phone.txt를 출력합니다.");
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\Temp\\phone.txt");
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}


	}

}
