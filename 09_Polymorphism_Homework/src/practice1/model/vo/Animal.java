package practice1.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kind) {
		this.name = name;
		this.kinds = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public String getName() {
		return name;
	}
	
	public String getKinds() {
		return kinds;
	}
	
	@Override
	public String toString() {
		return "내 이름은 " + name + ". 종류는 " + kinds + ".";
	}
	
	public abstract void speak();

}
