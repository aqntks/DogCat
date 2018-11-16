package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
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
		File file = new File("profile.txt");
		if(file.exists()) 
			saveProfile.loadFile(); //���� ����� �� ������ ���� ���� ������
		

		eastPanel = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/3, screenSize.height/4);  //������ ���� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("������ ���̾");  //������ �̸�
		Image img = kit.getImage("main_icon.gif");  // ������ �̹���
		setIconImage(img);

		//ImageIcon normalIcon = new ImageIcon("diarybutton.jpg");

		eastPanel.setLayout(new GridLayout(5, 1));
		setLayout(new BorderLayout());
		diaryBt = new JButton("���̾");
		profileBt = new JButton("������ ���");
		informationBt = new JButton("����");
		speciesBt = new JButton("��");
		exitBt = new JButton("����");

		diaryBt.setBackground(new Color(245, 220, 168));
		profileBt.setBackground(new Color(160, 190, 224));
		informationBt.setBackground(new Color(160, 190, 224));
		speciesBt.setBackground(new Color(160, 190, 224));
		exitBt.setBackground(new Color(216, 216, 216));

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
			//�̹��� �߰��� �ʿ���
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
