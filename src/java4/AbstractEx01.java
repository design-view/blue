package java4;

// �߻�Ŭ������ ��ü�� �ִ� �޼����, ���� �޼��带 ���� �� �ִ�.
// �߻�Ŭ������ new �� �� ����.
// �߻�Ŭ������ ����� ��ɰ� ���� ������ ���� �� �ִ�.
interface  Į {
		public abstract void ų();
		public abstract void �丮();
		public abstract void ����();
		public abstract void ����();
}

abstract class �丮����� implements Į {

	@Override
	public void ų() {}@Override
	public void ����() { }@Override
	public void ����() {}
	
	public void order() {
		����();
		ų();
		����();
	}
	
}
class ������  extends �丮�����{
	@Override
	public void �丮() {
		System.out.println("�丮��");
	}
}
public class AbstractEx01 {

	public static void main(String[] args) {
		������ b = new ������();
		b.�丮();
	}

}
