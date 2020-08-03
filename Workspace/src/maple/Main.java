package maple;

import java.util.Scanner;
import java.util.InputMismatchException;
import classTest.Student;

public class Main {
	
	static Security array[] = new Security[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			
			int number = printMenu(); // 메뉴 출력 및 번호 리턴
								
			if(number == 1) { // 회원가입
				
				System.out.print("Id : "); // ID 입력
				String id = sc.next();
				
				boolean check = true;

				for(int i = 0 ; i < n ; i++) { // ID 중복 확인
					if(array[i].getId().equals(id)) {
						check = false;
					}
				}
				
				if(check) { // 중복 안되면 password 입력받기
					System.out.print("Password : ");
					String password = sc.next();
					array[n] = new Security(id, password);
					n++;
				}else { // 중복 예외처리
					System.out.println("이미 존재하는 ID입니다.");
				}
				
				
			}else if(number == 2) { // 캐릭터 생성
				System.out.println("회원가입 여부를 확인하겠습니다."); // 회원가입 확인
				System.out.print("Id : ");
				String id = sc.next();
				
				int checkNumber = -1;
				for(int i = 0 ; i < n ; i++) {
					if(array[i].getId().equals(id)) { // ID 확인
						checkNumber = i;
					}
				}
				
				if(checkNumber < 0) { // ID 존재  X
					System.out.println("ID가 존재하지 않습니다.");
					continue;
				}else { // ID, Password 일치 확인
					System.out.print("Password : ");
					String password = sc.next();
					
					boolean check = true;
					if(array[checkNumber].getPassword().equals(password)) { // 확인 완료
						System.out.println("확인이 완료되었습니다.");
					}else { // 불일치
						System.out.println("비밀번호가 일치하지 않습니다.");
						continue;
					}
				}
			
				System.out.print("Name : "); // 닉넴 입력받기
				String name = sc.next();
				
				boolean check = true; // 닉넴 중복확인
				for(int i = 0 ; i < n - 1 ; i++) {
					if(array[i].getName().equals(name)||array[i].getName().equals("")) {
						check = false;
					}
				}
				
				if(check) {// 닉넴 생성 완료 직업 입력받기
					ShowJob();
					System.out.print("직업 : ");
					String job = sc.next();
					array[checkNumber].setName(name);
					array[checkNumber].setJob(job);
				}else { // 닉넴 중복 예외처리
					System.out.println("이미 존재하는 닉네임입니다.");
					continue;
				}
				
			}else if(number == 3) {
				System.out.println("정보 확인하기!");
				for(int i = 0 ; i < n ; i++) {
					System.out.println("ID : " + array[i].getId() + "\npassword : " + array[i].getPassword() + "\nName : " + array[i].getName() + "\nJob : " + array[i].getJob() + "\n");
				}
				
			}else if(number == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}

			

		}

	}
	
	static int printMenu() { // 메뉴 출력 및 번호 리턴
		System.out.println("--------------------");
		System.out.println("1. 회원가입");
		System.out.println("2. 캐릭터 생성");
		System.out.println("3. 캐릭터 생성 확인");
		System.out.println("4. exit");
		System.out.println("--------------------");
		
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		return number;
	}
	
	static void ShowJob() {
		System.out.println("모험가");
		System.out.println("시그너스 기사단");
		System.out.println("레지스탕스");
		System.out.println("영웅");
		System.out.println("노바");
		System.out.println("레프");
		System.out.println("데몬");
		System.out.println("아니마");
		System.out.println("제로");
		System.out.println("키네시스");
		System.out.println("아델");
	}
	
}
