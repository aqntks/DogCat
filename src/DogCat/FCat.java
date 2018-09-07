package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FCat extends JFrame{
	public FCat() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("Cat");  //프레임 이름
		setVisible(true);
	}
}
