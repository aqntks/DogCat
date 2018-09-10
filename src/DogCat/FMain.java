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
	private JButton diaryBt;
	private JButton informationBt;
	private JButton speciesBt;
	private JButton exitBt;

	public FMain() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("������ ���̾");  //������ �̸�
		Image img = kit.getImage("main_icon.gif");  // ������ �̹���
		setIconImage(img);

		setLayout(new FlowLayout());
		diaryBt = new JButton("���̾");
		informationBt = new JButton("����");
		speciesBt = new JButton("����");
		exitBt = new JButton("����");
		this.add(diaryBt);
		this.add(informationBt);
		this.add(speciesBt);
		this.add(exitBt);

		diaryBt.addActionListener(this);
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
			//�̹��� �߰��� �ʿ���
			dogcat.add(new LoadImageApp());
			dogcat.pack();
			dogcat.setVisible(true);
			dogcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
		}
		if(e.getSource() == informationBt) {
			FInformation information = new FInformation();
			dispose();
		}
		if(e.getSource() == diaryBt) {
			FDiary diary = new FDiary();
			dispose();
		}
		if(e.getSource() == exitBt) {
			System.exit(0);
		}

	}
}
