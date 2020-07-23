package control;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 20;
		
		if(score>=90) {
			System.out.println("A");
		}
		if((score>=80)&&(score<90)) {
			System.out.println("B");
		}
		if(score<80){
			System.out.println("F");
		}
		
		/*switch(score) {
		case (score>=90):
			System.out.println("A");
			break;
		case ((score>=80)&&(score<90)):
			System.out.println("B");
			break;
		case (score<80):
			System.out.println("F");
			break;
		}*/

	}

}
