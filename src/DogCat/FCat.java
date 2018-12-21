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

public class FCat extends JFrame {
	private JButton[] catButton;
	private JLabel catL;
	private JPanel catP;
	private String[] cats = {"��ġŲ", "��", "�긮Ƽ�ü����", "�ƺ�ôϾ�", "����ũ��", "���þȺ��", "�丣�þ�", "����",
			"�븣���̽�", "��", "������", "��Ű�þӰ��"};

	public FCat() {
		catButton = new JButton[12];
		catL = new JLabel("                                              "
				+ "                 �� �����ϰ� ���� ����̸� �����ϼ��� ��");
		catP = new JPanel();

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(650,200);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("Cat");  //������ �̸�

		catP.setLayout(new GridLayout(2, 6));

		for(int i = 0; i < catButton.length; i++) {
			catButton[i] = new JButton(cats[i]);
			catP.add(catButton[i]);
			catButton[i].setBackground(new Color(206, 222, 239));
		}

		setLayout(new BorderLayout());

		add(catL, BorderLayout.PAGE_START);
		add(catP, BorderLayout.CENTER);


		for(int i = 0; i < catButton.length; i++) {
			catButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					for(int i = 0; i < catButton.length; i++) {
						if(e.getSource() == catButton[i]) {	
							FSpeciesIf fi = new FSpeciesIf(cats[i]);
							fi.add(new LoadImage(1, cats[i]));
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