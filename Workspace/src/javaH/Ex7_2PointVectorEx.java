package javaH;

import java.util.Vector;

class pppPoint{
	private int x, y;
	public pppPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Ex7_2PointVectorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <pppPoint> v = new Vector <pppPoint> ();
		
		v.add(new pppPoint(2, 3));
		v.add(new pppPoint(-5, 20));
		v.add(new pppPoint(30, -8));
		
		v.remove(1);
		
		for(int i=0 ; i<v.size(); i++) {
			pppPoint p = v.get(i);
			System.out.println(p);
		}

	}

}
