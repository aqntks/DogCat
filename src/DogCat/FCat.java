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
	private String[] cats = {"먼치킨", "뱅갈", "브리티시숏헤어", "아비시니안", "스핑크스", "러시안블루", "페르시안", "랙돌",
			"노르웨이숲", "샴", "메인쿤", "터키시앙고라"};

	public FCat() {
		catButton = new JButton[12];
		catL = new JLabel("                                              "
				+ "                 ★ 구경하고 싶은 고양이를 선택하세요 ★");
		catP = new JPanel();

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(650,200);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("Cat");  //프레임 이름

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