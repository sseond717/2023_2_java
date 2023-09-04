package s0814_1;

public class Rectangle extends Shape{
	private int width, height;

	public Rectangle() {
		super();
	}
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("가로 " + width + ", 세로 " + height + "인 사각형으로 그립니다.");
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("가로가 " + width + " 세로가 " + height + "인 사각형의 넓이는 " + width*height+ "입니다");
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("가로가 " + width + " 세로가 " + height + "인 사각형의 둘레는 "+ 2*(width+height) + "입니다.");
	}
	
	
}
  