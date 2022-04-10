package exam09;

import javax.swing.JFrame;

public class MyFrameTest {
	public static void main(String[] args) {
		//MyFrame f = new MyFrame("창 만들기 연습");
		JFrame f = new MyFrame("창 만들기 연습");//is-a 관계이므로 이렇게사용해도 동일.
		//창을 보여주게 하기 위해서는 창 사이즈 설정 및 보여달라는 것 설정해야함.
		//setSize, setVisible
	}
}
