package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FInformation extends JFrame {
	public FInformation() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(1200, 100);  //프레임 생성 위치
		setTitle("정보");  //프레임 이름
		
		setVisible(true);
	}

}
