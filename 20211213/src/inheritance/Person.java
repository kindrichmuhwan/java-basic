package inheritance;

public class Person {
	// 사람이라면 공통적으로 가질 수 있는 속성 정의
	public String name;
	public int age;
	
	//생성자 정의. 이름, 나이를 모두입력받게 해주세요.
	//private Person(String n, int a) {
		//name = n;
		//age = a;
		
	//}
	
	//getInfo() 이름은 name입니다. 나이는 age입니다. 라고 찍게 만들어주세요.
	public void getInfo() {
		System.out.println("이름은:" + name + "입니다." +"나이는" + age +"입니다." );
	

	}

}
