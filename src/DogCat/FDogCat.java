package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FDogCat extends JFrame implements ActionListener {
	private JButton dogButton;
	private JButton catButton;
	private JButton endButton;

	public FDogCat(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //프레임 사이즈
		setLocation(1200, 400);  //프레임 생성 위치
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("DogCat");  //프레임 이름
		Image img = kit.getImage("main_icon.gif");  // 아이콘 이미지
		setIconImage(img);
		setVisible(true);

		setLayout(new BorderLayout());
		dogButton = new JButton("멍멍이");
		catButton = new JButton("냥냥이");
		endButton = new JButton("종료");
		this.add(dogButton, BorderLayout.LINE_START);
		this.add(catButton, BorderLayout.LINE_END);
		this.add(endButton, BorderLayout.PAGE_END);

		//이벤트 리스너
		dogButton.addActionListener(this);
		catButton.addActionListener(this);
		endButton.addActionListener(this);

		setVisible(true);


	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == dogButton)
			new FDog();
		if(e.getSource() == catButton)
			new FCat();
		if(e.getSource() == endButton)
			System.exit(0);
	}
}