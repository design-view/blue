package java4;

class 지구인 {
	
}

class 아시아인 extends 지구인 {
	
}

class 한국인 extends 아시아인{
	
}

//연장하다.
class 박보검 extends 한국인 {
	String name = "박보검";
}

public class WorldEx01 {

	public static void main(String[] args) {
		아시아인 a  = new 박보검();
		//타입변환 ... 다운케스팅
		System.out.println(((박보검)a).name); 
		
	}

}
