package DogCat;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FMain extends JFrame implements ActionListener{
	private JButton speciesBt;

	public FMain() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("마이펫 다이어리");  //프레임 이름
		Image img = kit.getImage("main_icon.gif");  // 아이콘 이미지
		setIconImage(img);

		setLayout(new FlowLayout());
		speciesBt = new JButton("도감");
		this.add(speciesBt);

		speciesBt.addActionListener(this);

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
			dogcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
			
	}
}
