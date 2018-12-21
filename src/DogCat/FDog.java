package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FDog extends JFrame {
	private JButton[] dogButton;
	private JLabel dogL;
	private JPanel dogP;
	private String[] dogs = {"��縮Ʈ����", "��𿹵�", "�����ݸ�", "�����ڱ�", "�ڽ���Ʈ", "���������", "��Ƽ��", "ġ�Ϳ�",
			"�۱�", "��ũ���׸���", "��������", "����"};
	
	public FDog() {
		dogButton = new JButton[12];
		dogL = new JLabel("                                              "
				+ "                 �� �����ϰ� ���� �������� �����ϼ��� ��");
		dogP = new JPanel();
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(650,200);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("Dog");  //������ �̸�
		
		dogP.setLayout(new GridLayout(2, 6));
		
		for(int i = 0; i < dogButton.length; i++) {
			dogButton[i] = new JButton(dogs[i]);
			dogP.add(dogButton[i]);
			dogButton[i].setBackground(new Color(206, 222, 239));
		}
		
		setLayout(new BorderLayout());
		
		add(dogL, BorderLayout.PAGE_START);
		add(dogP, BorderLayout.CENTER);
		
		
		for(int i = 0; i < dogButton.length; i++) {
			dogButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					for(int i = 0; i < dogButton.length; i++) {
						if(e.getSource() == dogButton[i]) {
							FSpeciesIf fi = new FSpeciesIf(dogs[i]);
							fi.add(new LoadImage(0, dogs[i]));
							fi.pack();
							fi.setVisible(true);
						}
					}
				}
			}); 
		}
		
		
		setVisible(true);
	}
}
