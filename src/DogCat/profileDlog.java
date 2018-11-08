package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class profileDlog extends JDialog{
	private JLabel infoL = new JLabel("      �� �ֿϵ����� �������� ����� �ּ��� ��");
	private JLabel nameL = new JLabel("�̸� : ");
	private JLabel speciesL = new JLabel("�� : ");  // ���� ���� ����
	private JLabel yearL  = new JLabel("���� : ");
	
	private static JTextField pfName = new JTextField(10);
	private JComboBox petSpecies = new JComboBox<String>();
	private JComboBox petYear = new JComboBox<Integer>();
	private JComboBox petMonth = new JComboBox<Integer>();
	private JComboBox petDate = new JComboBox<Integer>();
	
	private JButton addButton = new JButton("���");
	
	//������
	public profileDlog() {
		
		//��� ���̾�α׷� �����
		//setModal(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setTitle("�ֿϵ��� ������ �Է�");
		setLocation(1200, 300);
		setSize(300, 300);
		
		setLayout(new GridLayout(5, 1));
		infoL.setLayout(new BorderLayout());
		speciesL.setLayout(new FlowLayout());
		nameL.setLayout(new FlowLayout());
		yearL.setLayout(new FlowLayout());
		
		//�޺��ڽ� �� �� �� �� ����
		for(int i = 2000; i <= 2030; i++)
			petYear.addItem(i);
		for(int i = 1; i<= 12; i++)
			petMonth.addItem(i);
		//���� �´� �� �����ؾ���
		for(int i = 1; i<= 31; i++)
			petDate.addItem(i);
		
		nameL.add(pfName);
		speciesL.add(petSpecies);
		yearL.add(petYear);
		yearL.add(petMonth);
		yearL.add(petDate);
		
		add(infoL);
		add(nameL);
		add(speciesL);
		add(yearL);
		add(addButton);
		
		setVisible(true);
		
	}
	//�Է��� ���ڿ� ���� �޼ҵ�
	static String getInput() {
		if(pfName.getText().length() == 0) return null;
		else return pfName.getText();
	}
	//������ �Է°��� �����ϴ� �޼ҵ� ��������
}
