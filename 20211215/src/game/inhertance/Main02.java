package game.inhertance;

public class Main02 {

	public static void main(String[] args) {
		//Warrior 생성을 하나 해 주세요.
		Warrior w1 = new Warrior("김방구");
		
		//정보 조회를 해보시고, 호출순번도 고려해보세요.
		//w1.name="김방구";
		//w1.lv=1;
		//w1.hp=20;
		//w1.mp=10;
		//w1.pDam=2;
		w1.getInfo();
		

	}

}