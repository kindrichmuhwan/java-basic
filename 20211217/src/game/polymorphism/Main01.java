package game.polymorphism;



public class Main01 {

	public static void main(String[] args) {
		   //Commoner 생성
			Commoner c1 = new Commoner("이순신");
			
			//Orc 생성
		
		Monster o1 = new Orc();
			
			c1.hunt(o1);
			c1.hunt(o1);
			
	}

}
