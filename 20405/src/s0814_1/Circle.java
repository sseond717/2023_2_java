package s0814_1;

public class Circle extends Shape{
	private int radius;

	public Circle() {
		super();
	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("반지름 " + radius + "인 원으로 그립니다.");
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + PI*radius*radius + "입니다.");
	}
	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 " + radius + "인 원의 둘레는 " + PI*2*radius + "입니다.");
	}
	
	
	
}
  