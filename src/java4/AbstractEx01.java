package java4;

// 추상클래스는 몸체가 있는 메서드와, 없는 메서드를 만들 수 있다.
// 추상클래스는 new 할 수 없다.
// 추상클래스는 어뎁터의 기능과 일의 순서를 정할 수 있다.
interface  칼 {
		public abstract void 킬();
		public abstract void 요리();
		public abstract void 군무();
		public abstract void 조각();
}

abstract class 요리어댑터 implements 칼 {

	@Override
	public void 킬() {}@Override
	public void 조각() { }@Override
	public void 군무() {}
	
	public void order() {
		조각();
		킬();
		군무();
	}
	
}
class 백종원  extends 요리어댑터{
	@Override
	public void 요리() {
		System.out.println("요리중");
	}
}
public class AbstractEx01 {

	public static void main(String[] args) {
		백종원 b = new 백종원();
		b.요리();
	}

}
