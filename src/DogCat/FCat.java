package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FCat extends JFrame{
	public FCat() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("Cat");  //������ �̸�
		setVisible(true);
	}
}
