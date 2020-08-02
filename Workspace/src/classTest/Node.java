package classTest;

public class Node {
	
	private int x;
	private int y;
	
	
	int getX() {
		return x;
	}
	
	void setX(int x) {
		this.x = x;
	}

	
	int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}
	
	
	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Node center(Node node) {
		return new Node((this.x + node.getX()) / 2, (this.y + node.getY()) / 2);
	}

}
