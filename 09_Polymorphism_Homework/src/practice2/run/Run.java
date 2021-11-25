package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.Iphone12;
import practice2.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new Iphone12();
		
		for(int i=0; i<phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].picture();
			phone[i].charge();
			phone[i].touch();
			
			System.out.println();
		}
		
		

	}

}
