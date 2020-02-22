package java3;

/**
 * 
 * @author �����ε��� �Ѱ�
 * �ذ��� : ������ (���)
 *
 */

//�������̽��� new�� �� ����.
// �������̽ô� �߻�(abstract) �޼��带 ������.
// �������̽��� �޼���� public abstract�� �����Ǿ� �ִ�.
// �������̽��� �޼����� ��ü�� ���� �� ����.
// �������̽��� ������ �ڽ� Ŭ������ �߻� �޼��带 ������ �����ؾ� �Ѵ�. (������)
interface Unit {
	//static ������ ����� �ִ�.
	int data = 10;
	int getAttack();
	int getHp();
	String getName();
	void setHp(int hp);
}

class Zealot implements Unit{
	
	String name;
	int hp;
	int attack;

	public Zealot(String name) {
		this(name,100,10);
	}
	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		System.out.println(hp);
	}
	@Override
	public String getName() {
		return name;
	}
}

class Dragoon implements Unit{
	String name;
	int hp;
	int attack;
	
	public Dragoon(String name) {
		this(name,150,20);
	}
	public Dragoon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		System.out.println(hp);
	}
	@Override
	public String getName() {
		return name;
	}
}

class Hydra implements Unit{
	String name;
	int hp;
	int attack;
	
	public Hydra(String name) {
		this(name,200,30);
	}
	public Hydra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		System.out.println(hp);
	}
	@Override
	public String getName() {
		return name;
	}
}

class Ultra implements Unit{
	private String name;
	private int hp;
	private int attack;
	public Ultra(String name) {
		this(name,250,40);
	}
	public Ultra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String getName() {
		return name;
	}
}
public class OOPEx04 {
	
	// ����� -> �����
	static void attack(Unit u1, Unit u2) {
		u1.setHp(u1.getHp() - u2.getAttack());
		System.out.println(u1.getName() + "��" + u2.getName() + "���� ���ݴ��ؼ� ü����"+u1.getHp() +"�� �Ǿ���.");
		
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1");
		Dragoon d1 = new Dragoon("����1");
		Hydra h1 = new Hydra("�����1");
		//���� -> ���
		attack(z1, d1);
		//����� -> ���
		attack(h1,d1);
	}
	
}



