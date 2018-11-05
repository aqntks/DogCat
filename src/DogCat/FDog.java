package DogCat;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FDog extends JFrame {
	private JButton[] dogButton;
	private String[] dogs = {"말티즈", "요크셔테리어", "시츄", "포메라니안", "치와와", "웰시코기", "슈나우저", "닥스훈트",
			"퍼그", "푸들", "페키니즈", "미니핀", "빠삐용"};
	
	public FDog() {
		dogButton = new JButton[13];
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("Dog");  //프레임 이름
		
		setLayout(new GridLayout(5, 3));
		
		for(int i = 0; i < dogButton.length; i++) {
			dogButton[i] = new JButton(dogs[i]);
			add(dogButton[i]);
		}
		
		setVisible(true);
	}
}
