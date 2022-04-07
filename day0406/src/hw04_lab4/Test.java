package hw04_lab4;

abstract class GameCharacter {
	
	public void draw() {
		System.out.println("Game Character의 draw().");
	}
	public void getLife() {
		System.out.println("Game Character의 getLife().");
	}
}

class Hobitt extends GameCharacter {
	public void draw() {
		System.out.println("호빗을 그립니다.");
	}
	public void getRing() {
		System.out.println("Hobitt의 getRing()");
	}
}

class Titan extends GameCharacter {
	public void draw() {
		System.out.println("타이탄을 그립니다.");
	}
	public void getTitan() {
		System.out.println("Titan의 getTitan()");
	}
}

class Sorcerer extends GameCharacter {
	public void draw() {
		System.out.println("마법사를 그립니다.");
	}
	public void getSoc() {
		System.out.println("Sorcerer의 getSoc()");
	}
}


public class Test {
	public static void main(String[] args) {
		GameCharacter g1 = new Hobitt(); //호빗 객체 생성.
		g1.getLife(); //부모클래스의 메소드는 잘 출력됨.
		//g1.getRing(); 부모 클래스 메소드 오버라이딩이 아닌 새로운 메소드라오류
		((Hobitt)g1).getRing(); //자식 클래스의 메소드 사용을 위해 자식 클래스로 캐스팅.
		System.out.println("---------------------------");
		
		//배열안에 저장. 각각 2개씩 
		// 부모클래스로 배열 선언시 모두 담을수 있음. 
		GameCharacter []array = new GameCharacter[6];
		array[0] = new Hobitt();
		array[1] = new Hobitt();
		array[2] = new Titan();
		array[3] = new Titan();
		array[4] = new Sorcerer();
		array[5] = new Sorcerer();
		// 기본생성자 자동생성 ---
				
		for (int i=0; i<array.length; i++) {
			array[i].draw();
		}
		
	}

}
