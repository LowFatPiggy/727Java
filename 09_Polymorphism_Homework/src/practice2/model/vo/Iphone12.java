package practice2.model.vo;

public class Iphone12 extends SmartPhone{
	
	public Iphone12() {
		
	}
	@Override
	public void makeaCall() {
		System.out.println("번호 입력 후 통화버튼");
	}
	
	public void takeaCall() {
		System.out.println("수신 버튼");
	}

	public void picture() {
		System.out.println("1200만 듀얼");
	}
	
	public void charge() {
		System.out.println("고속 [무선] 충전");
	}
	
	public void touch() {
		System.out.println("정전식");
	}
	@Override
	public void printMaker() {
		System.out.println("APPLE");
	}
}
