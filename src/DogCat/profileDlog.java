package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class profileDlog extends JDialog{
	private JLabel infoL = new JLabel("                �� �ֿϵ����� �������� ����� �ּ��� ��");
	private JPanel nameP = new JPanel();
	private JPanel speciesP = new JPanel();  // ���� ���� ����
	private JPanel genderP = new JPanel();
	private JPanel yearP  = new JPanel();
	private ButtonGroup genderG = new ButtonGroup();

	private JTextField pfName = new JTextField(10);
	private JComboBox<String> petSpecies = new JComboBox<String>();
	private JComboBox<Integer> petYear = new JComboBox<Integer>();
	private JComboBox<Integer> petMonth = new JComboBox<Integer>();
	private JComboBox<Integer> petDate = new JComboBox<Integer>();
	private JRadioButton petMale = new JRadioButton("����");
	private JRadioButton petFemale = new JRadioButton("����");
	private String[] sp = {" ������ ", " ����� "};
	private JList<String> speciesList = new JList<String>(sp);

	private JButton addButton = new JButton("���");

	//������
	public profileDlog() {

		//��� ���̾�α׷� �����
		//setModal(true);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setTitle("�ֿϵ��� ������ �Է�");
		setLocation(1200, 300);
		setSize(350, 350);

		
		GridLayout grid = new GridLayout(6, 1);
		grid.setVgap(10);
		setLayout(grid);
		infoL.setLayout(new BorderLayout());
		nameP.setLayout(new FlowLayout(FlowLayout.LEFT, 28 , 0));
		speciesP.setLayout(new FlowLayout(FlowLayout.LEFT, 40 , 0));
		genderP.setLayout(new FlowLayout(FlowLayout.LEFT, 28 , 0));
		yearP.setLayout(new FlowLayout());

		
		genderG.add(petMale);
		genderG.add(petFemale);
		
		//�޺��ڽ� �� �� �� �� ����
		for(int i = 2000; i <= 2030; i++)
			petYear.addItem(i);
		for(int i = 1; i<= 12; i++)
			petMonth.addItem(i);
		//���� �´� �� �����ؾ���
		for(int i = 1; i<= 31; i++)
			petDate.addItem(i);

		nameP.add(new JLabel("�̸� :            "));
		nameP.add(pfName);
		speciesP.add(new JLabel("�� :         "));
		speciesP.add(speciesList);  
		speciesP.add(petSpecies);
		genderP.add(new JLabel("���� :         "));
		genderP.add(petMale);
		genderP.add(petFemale);
		yearP.add(new JLabel("���� :         "));
		yearP.add(petYear);
		yearP.add(new JLabel(" ��"));
		yearP.add(petMonth);
		yearP.add(new JLabel(" ��"));
		yearP.add(petDate);
		yearP.add(new JLabel(" ��"));

		add(infoL);
		add(nameP);
		add(genderP);
		add(speciesP);
		add(yearP);
		add(addButton);

		setVisible(true);
		
		//����Ŭ���� �̺�Ʈ ó����
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			saveProfile.name = getPfName(); // �̸� ��� ���Ѱ�� null��
			saveProfile.gender= getPfGender(); //(������ 0 , ������ 1, ���þȵȰ�� -1)
			saveProfile.birthday = getPfBirthday();
			JOptionPane.showMessageDialog(null, "                               ��ϿϷ�", " �ȳ�", JOptionPane.PLAIN_MESSAGE);
			dispose();
			}
		});
		

	}
	//�Է��� �̸� ���� �޼ҵ�
	public String getPfName() {
		if(pfName.getText().length() == 0) return null;
		else return pfName.getText();
	}
	//�Է��� ���� ���� �޼ҵ� (������ 0 , ������ 1, ���þȵȰ�� -1)
	public int getPfGender() {
		if(petMale.isSelected())
			return 0;
		else if(petFemale.isSelected())
			return 1;
		else
			return -1;
	}
	//�Է��� ���� ���� �޼ҵ�
	public Day getPfBirthday() {
		int year = (int)petYear.getSelectedItem();
		int month = (int)petMonth.getSelectedItem();
		int date = (int)petDate.getSelectedItem();
		return new Day(year, month, date);
	}
	//������ �Է°��� �����ϴ� �޼ҵ� ��������
	
}
