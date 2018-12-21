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
	private String[] dogs = {"골든리트리버", "사모예드", "보더콜리", "웰시코기", "닥스훈트", "비숑프리제", "말티즈", "치와와",
			"퍼그", "요크셔테리어", "도베르만", "시츄"};
	
	public FDog() {
		dogButton = new JButton[12];
		dogL = new JLabel("                                              "
				+ "                 ★ 구경하고 싶은 강아지를 선택하세요 ★");
		dogP = new JPanel();
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(650,200);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("Dog");  //프레임 이름
		
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
