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
	private JLabel infoL = new JLabel("      ★ 애완동물의 프로필을 등록해 주세요 ★");
	private JLabel nameL = new JLabel("이름 : ");
	private JLabel speciesL = new JLabel("종 : ");  // 아직 구현 안함
	private JLabel yearL  = new JLabel("생일 : ");
	
	private static JTextField pfName = new JTextField(10);
	private JComboBox petSpecies = new JComboBox<String>();
	private JComboBox petYear = new JComboBox<Integer>();
	private JComboBox petMonth = new JComboBox<Integer>();
	private JComboBox petDate = new JComboBox<Integer>();
	
	private JButton addButton = new JButton("등록");
	
	//생성자
	public profileDlog() {
		
		//모달 다이얼로그로 만들기
		//setModal(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setTitle("애완동물 프로필 입력");
		setLocation(1200, 300);
		setSize(300, 300);
		
		setLayout(new GridLayout(5, 1));
		infoL.setLayout(new BorderLayout());
		speciesL.setLayout(new FlowLayout());
		nameL.setLayout(new FlowLayout());
		yearL.setLayout(new FlowLayout());
		
		//콤보박스 값 년 월 일 생성
		for(int i = 2000; i <= 2030; i++)
			petYear.addItem(i);
		for(int i = 1; i<= 12; i++)
			petMonth.addItem(i);
		//월에 맞는 일 생성해야함
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
	//입력한 문자열 리턴 메소드
	static String getInput() {
		if(pfName.getText().length() == 0) return null;
		else return pfName.getText();
	}
	//나머지 입력값을 리턴하는 메소드 만들어야함
}
