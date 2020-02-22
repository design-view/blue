package java4;

class Animal {
	
	void sound(String aa) {
		System.out.println(aa);
	}
}
//동적바인딩
class Dog extends Animal {
	//무효화시키다.부모가 가진 매서드를 무효화 시킨다.
	
}

class Cat  extends Animal{
	
}

class Bird  extends Animal{
	void sound() {
		System.out.println("짹짹");
	}
}

class Tiger  extends Animal{
	void sound() {
		System.out.println("짹짹");
	}
}

class Cow  extends Animal{
	void sound() {
		System.out.println("음매");
	}
}

public class AnimalEx01 {
	
	
	public static void main(String[] args) {
		Cat a = new Cat();
		a.sound("멍멍");
		
	}

}
