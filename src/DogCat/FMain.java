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

		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("������ ���̾");  //������ �̸�
		Image img = kit.getImage("main_icon.gif");  // ������ �̹���
		setIconImage(img);

		setLayout(new FlowLayout());
		speciesBt = new JButton("����");
		this.add(speciesBt);

		speciesBt.addActionListener(this);

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
		}
			
	}
}
