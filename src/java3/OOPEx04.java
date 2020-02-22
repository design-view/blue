package java3;

/**
 * 
 * @author 오버로딩의 한계
 * 해결방안 : 다형성 (상속)
 *
 */

//인터페이스는 new할 수 없다.
// 인터페이시는 추상(abstract) 메서드를 가진다.
// 인터페이스의 메서드는 public abstract가 생략되어 있다.
// 인터페이스의 메서느는 몸체를 만들 수 없다.
// 인터페이스를 구현한 자식 클래스는 추상 메서드를 무조건 구현해야 한다. (강제성)
interface Unit {
	//static 변수만 만들수 있다.
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
	
	// 히드라 -> 히드라
	static void attack(Unit u1, Unit u2) {
		u1.setHp(u1.getHp() - u2.getAttack());
		System.out.println(u1.getName() + "이" + u2.getName() + "에게 공격당해서 체력이"+u1.getHp() +"이 되었다.");
		
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라곤1");
		Hydra h1 = new Hydra("히드라1");
		//질럿 -> 드라군
		attack(z1, d1);
		//히드라 -> 드라군
		attack(h1,d1);
	}
	
}



