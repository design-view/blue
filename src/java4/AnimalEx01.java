package java4;

class Animal {
	
	void sound(String aa) {
		System.out.println(aa);
	}
}
//�������ε�
class Dog extends Animal {
	//��ȿȭ��Ű��.�θ� ���� �ż��带 ��ȿȭ ��Ų��.
	
}

class Cat  extends Animal{
	
}

class Bird  extends Animal{
	void sound() {
		System.out.println("±±");
	}
}

class Tiger  extends Animal{
	void sound() {
		System.out.println("±±");
	}
}

class Cow  extends Animal{
	void sound() {
		System.out.println("����");
	}
}

public class AnimalEx01 {
	
	
	public static void main(String[] args) {
		Cat a = new Cat();
		a.sound("�۸�");
		
	}

}
