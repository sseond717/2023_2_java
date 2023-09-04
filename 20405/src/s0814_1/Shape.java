package s0814_1;

public abstract class Shape {
	
	private String name;
	protected static int shapeCnt;
	protected final static double PI = 3.14;
	
	
	public Shape() {
		shapeCnt++;
	}
	public Shape(String name) {
		this();
		this.name = name;
	}
	void draw() {
		System.out.println(name + " 도형 그리기");
	}
	
	public abstract void calculateArea();
	public abstract void calculateRound();
}
  