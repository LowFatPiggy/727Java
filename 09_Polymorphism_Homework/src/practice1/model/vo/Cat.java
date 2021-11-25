package practice1.model.vo;

public class Cat extends Animal {
	
	private String location;
	private String color;
	
	public Cat() {
		
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식. " + "색상은 " + color + ".");
	}

}
