package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FDiary extends JFrame {
	public FDiary() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("���̾");  //������ �̸�
		setVisible(true);
	}

}
