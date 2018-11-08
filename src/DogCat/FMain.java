package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FMain extends JFrame implements ActionListener{
	private JPanel eastPanel;
	private JButton diaryBt;
	private JButton profileBt;
	private JButton informationBt;
	private JButton speciesBt;
	private JButton exitBt;

	public FMain() {
		eastPanel = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(screenSize.width/3, screenSize.height/4);  //프레임 생성 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("마이펫 다이어리");  //프레임 이름
		Image img = kit.getImage("main_icon.gif");  // 아이콘 이미지
		setIconImage(img);

		eastPanel.setLayout(new GridLayout(5, 1));
		setLayout(new BorderLayout());
		diaryBt = new JButton("다이어리");
		profileBt = new JButton("프로필 등록");
		informationBt = new JButton("정보");
		speciesBt = new JButton("도감");
		exitBt = new JButton("종료");
		
		eastPanel.add(diaryBt);
		eastPanel.add(profileBt);
		eastPanel.add(speciesBt);
		eastPanel.add(informationBt);
		eastPanel.add(exitBt);
		
		this.add(eastPanel, BorderLayout.EAST);
		
		diaryBt.addActionListener(this);
		profileBt.addActionListener(this);
		informationBt.addActionListener(this);
		speciesBt.addActionListener(this);
		exitBt.addActionListener(this);

		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == speciesBt) {
			FDogCat dogcat = new FDogCat();
			//이미지 추가에 필요함
			dogcat.add(new LoadImageApp());
			dogcat.pack();
			dogcat.setVisible(true);
			//dogcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//dispose();
		}
		if(e.getSource() == profileBt) {
			new profileDlog();
			
		}
		if(e.getSource() == informationBt) {
			FInformation information = new FInformation();
			//dispose();
		}
		if(e.getSource() == diaryBt) {
			FDiary diary = new FDiary();
			//dispose();
		}
		if(e.getSource() == exitBt) {
			System.exit(0);
		}

	}
}
