package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FInformation extends JFrame {
	public FInformation() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(1200, 500);  //������ ���� ��ġ
		setTitle("����");  //������ �̸�
		setVisible(true);
	}

}
