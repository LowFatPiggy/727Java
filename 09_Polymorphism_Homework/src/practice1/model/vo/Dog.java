package practice1.model.vo;

public class Dog extends Animal {
	
	public final String PLACE = "局斑墨其";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + "个公霸绰 " + weight + "kg.");
	}

}
