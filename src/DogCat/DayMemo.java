package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DayMemo extends JFrame implements ActionListener{
	private JTextArea taMemo1, taMemo2;
	private JLabel lText1, lText2;
	private JLabel LImport, lProfile;
	private JPanel pText;
	private JPanel pMemo;
	private JButton bSaveMemo, bCloseMemo;
	private JMenuBar mbMemo;
	private JMenu menuMemo;
	private JMenuItem saveMenu, closeMenu;
	public Day yearMonth;
	public Day day;
	private File file1, file2;



	public DayMemo(Day day) {
		//��� ��¥�� �޸����� ����
		this.day = day;
		file1 = new File(day.print() + "-1.txt");
		file2 = new File(day.print() + "-2.txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //������ ������
		setLocation(1200, 500);  //������ ���� ��ġ
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "�� " + day.months + "�� " + day.days + "��");  //������ �̸�

		//��� â

		pText = new JPanel();
		pText.setLayout(null);
		lText1 = new JLabel("�� �߿� ����");
		lText2 = new JLabel("�� �ϱ�");
		LImport = new JLabel("^�����Դϴ�^");
		lProfile = new JLabel("- " + saveProfile.name + " (" + saveProfile.age + ")" + "   " + saveProfile.species + " -");
		taMemo1 = new JTextArea();
		taMemo2 = new JTextArea();
		lText1.setBounds(10,10,100,20);
		LImport.setBounds(150,10,100,20);
		lProfile.setBounds(300, 10 , 200 ,20);
		taMemo1.setBounds(10,40, 460, 100);
		lText2.setBounds(10,150,200,20);
		taMemo2.setBounds(10,180, 460, 200);
		pText.add(lText1);
		pText.add(taMemo1);
		pText.add(lText2);
		pText.add(taMemo2);

		//�����̸� �ؽ�Ʈ ���
		if(saveProfile.birthday.months == day.months && saveProfile.birthday.days == day.days)
			pText.add(LImport);
		//�������� �����Ǿ������� �޸� ������ ��� �߰�
		File pFile = new File("profile.txt");
		if(pFile.exists())
			pText.add(lProfile);

		//���� �б�
		if(file1.isFile()) {
			try {
				Scanner scan = new Scanner(file1);
				taMemo1.setText("");
				while(scan.hasNextLine()) {
					taMemo1.append(scan.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			}
		}
		if(file2.isFile()) {
			try {
				Scanner scan = new Scanner(file2);
				taMemo2.setText("");
				while(scan.hasNextLine()) {
					taMemo2.append(scan.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			}
		}


		//�ϴ� �ǳ�
		pMemo = new JPanel();
		//��� �޴� �� 
		mbMemo = new JMenuBar();
		menuMemo = new JMenu("�޴�");
		//��� �޴� �� ���
		saveMenu = new JMenuItem("����");
		closeMenu =new JMenuItem("����");
		//�ϴ� ����, ���� ��ư
		bSaveMemo = new JButton("����");
		bCloseMemo = new JButton("����");

		this.add(pText);
		this.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bSaveMemo);
		pMemo.add(bCloseMemo);

		this.setJMenuBar(mbMemo);
		//�޴� �޴� �߰�
		mbMemo.add(menuMemo);
		//�޴� �� ���
		menuMemo.add(saveMenu);
		menuMemo.add(closeMenu);

		bSaveMemo.addActionListener(this);
		bCloseMemo.addActionListener(this);
		saveMenu.addActionListener(this);
		closeMenu.addActionListener(this); 

		setVisible(true);

	}
	//�ε�� ������
	public DayMemo(DayMemo dm) {
		//��� ��¥�� �޸����� ����
		this.day = dm.day;
		file1 = new File(day.print() + "-1.txt");
		file2 = new File(day.print() + "-2.txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //������ ������
		setLocation(1200, 500);  //������ ���� ��ġ
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "�� " + day.months + "�� " + day.days + "��");  //������ �̸�



		//��� â
		taMemo1 = SaveMemo.getMemo(day).taMemo1;
		taMemo2 = SaveMemo.getMemo(day).taMemo2;

		pText = new JPanel();
		pText.setLayout(null);
		lText1 = new JLabel("�� �߿� ����");
		LImport = new JLabel("^�����Դϴ�^");
		lProfile = new JLabel("- " + saveProfile.name + " (" + saveProfile.age + ")" + "   " + saveProfile.species + " -");
		lText2 = new JLabel("�� �ϱ�");
		lText1.setBounds(10,10,200,20);
		LImport.setBounds(150,10,100,20);
		lProfile.setBounds(300, 10 , 200 ,20);
		taMemo1.setBounds(10,40, 460, 100);
		lText2.setBounds(10,150,200,20);
		taMemo2.setBounds(10,180, 460, 200);
		pText.add(lText1);
		pText.add(taMemo1);
		pText.add(lText2);
		pText.add(taMemo2);

		//�����̸� �ؽ�Ʈ ���
		if(saveProfile.birthday.months == day.months && saveProfile.birthday.days == day.days)
			pText.add(LImport);
		//�������� �����Ǿ������� �޸� ������ ��� �߰�
		File pFile = new File("profile.txt");
		if(pFile.exists())
			pText.add(lProfile);

		//���� �б�
		if(file1.isFile()) {
			try {
				Scanner scan = new Scanner(file1);
				taMemo1.setText("");
				while(scan.hasNextLine()) {
					taMemo1.append(scan.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			}
		}
		if(file2.isFile()) {
			try {
				Scanner scan = new Scanner(file2);
				taMemo2.setText("");
				while(scan.hasNextLine()) {
					taMemo2.append(scan.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			}
		}

		//�ϴ� �ǳ�
		pMemo = new JPanel();
		//��� �޴� �� 
		mbMemo = new JMenuBar();
		menuMemo = new JMenu("�޴�");
		//��� �޴� �� ���
		saveMenu = new JMenuItem("����");
		closeMenu =new JMenuItem("����");
		//�ϴ� ����, ���� ��ư
		bSaveMemo = new JButton("����");
		bCloseMemo = new JButton("����");

		this.add(pText);
		this.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bSaveMemo);
		pMemo.add(bCloseMemo);

		this.setJMenuBar(mbMemo);
		//�޴� �޴� �߰�
		mbMemo.add(menuMemo);
		//�޴� �� ���
		menuMemo.add(saveMenu);
		menuMemo.add(closeMenu);

		bSaveMemo.addActionListener(this);
		bCloseMemo.addActionListener(this);
		saveMenu.addActionListener(this);
		closeMenu.addActionListener(this); 

		setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == saveMenu || e.getSource() == bSaveMemo) {

			try {
				//file.createNewFile();
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1));
				BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
				bw1.write(taMemo1.getText()+" ");
				bw2.write(taMemo2.getText()+" ");
				bw1.close(); 
				bw2.close();
			} catch (IOException eI) {
				System.out.println("���� �߻�");
			}

			SaveMemo.save(this, day);
			JOptionPane.showMessageDialog(this, "                               ����Ϸ�", " �ȳ�", JOptionPane.PLAIN_MESSAGE);
		}
		if(e.getSource() == closeMenu || e.getSource() == bCloseMemo)
			dispose();
	}
}
