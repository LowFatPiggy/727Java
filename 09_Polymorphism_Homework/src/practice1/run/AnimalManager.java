package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("흰둥이", "말티즈계 믹스", 4);
		a[1] = new Cat("토머스 캣", "쇼트 헤어", "조지와 조앤네", "청회색");
		a[2] = new Dog("타이크", "불독", 2);
		a[3] = new Dog("스누피", "비글", 3);
		a[4] = new Cat("마리", "터키시 앙고라", "아델라이드네", "하얀색");
		
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}
		
	}

}
