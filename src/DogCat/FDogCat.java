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

		setSize(300,300);  //������ ������
		setLocation(1200, 400);  //������ ���� ��ġ
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("DogCat");  //������ �̸�
		Image img = kit.getImage("main_icon.gif");  // ������ �̹���
		setIconImage(img);
		setVisible(true);

		setLayout(new BorderLayout());
		dogButton = new JButton("�۸���");
		catButton = new JButton("�ɳ���");
		endButton = new JButton("����");
		this.add(dogButton, BorderLayout.LINE_START);
		this.add(catButton, BorderLayout.LINE_END);
		this.add(endButton, BorderLayout.PAGE_END);

		//�̺�Ʈ ������
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