package DogCat;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FDog extends JFrame {
	private JButton[] dogButton;
	private String[] dogs = {"��Ƽ��", "��ũ���׸���", "����", "���޶�Ͼ�", "ġ�Ϳ�", "�����ڱ�", "��������", "�ڽ���Ʈ",
			"�۱�", "Ǫ��", "��Ű����", "�̴���", "���߿�"};
	
	public FDog() {
		dogButton = new JButton[13];
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("Dog");  //������ �̸�
		
		setLayout(new GridLayout(5, 3));
		
		for(int i = 0; i < dogButton.length; i++) {
			dogButton[i] = new JButton(dogs[i]);
			add(dogButton[i]);
		}
		
		setVisible(true);
	}
}
