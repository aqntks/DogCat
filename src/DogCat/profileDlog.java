package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class profileDlog extends JDialog{
	private JLabel infoL = new JLabel("                ★ 애완동물의 프로필을 등록해 주세요 ★");
	private JPanel nameP = new JPanel();
	private JPanel speciesP = new JPanel(); 
	private JPanel genderP = new JPanel();
	private JPanel yearP  = new JPanel();
	private JPanel buttonP = new JPanel();
	private ButtonGroup genderG = new ButtonGroup();

	private JTextField pfName = new JTextField(10);
	private JComboBox<String> petSpecies = new JComboBox<String>();
	private JComboBox<Integer> petYear = new JComboBox<Integer>();
	private JComboBox<Integer> petMonth = new JComboBox<Integer>();
	private JComboBox<Integer> petDate = new JComboBox<Integer>();
	private JRadioButton petMale = new JRadioButton("수컷");
	private JRadioButton petFemale = new JRadioButton("암컷");
	private String[] sp = {" 강아지 ", " 고양이 "};
	private JList<String> speciesList = new JList<String>(sp);

	private JButton addButton = new JButton("등록");
	private JButton resetButton = new JButton("초기화");

	//생성자
	public profileDlog() {

		//모달 다이얼로그로 만들기
		//setModal(true);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setTitle("애완동물 프로필 입력");
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
		buttonP.setLayout(new FlowLayout());


		genderG.add(petMale);
		genderG.add(petFemale);

		//콤보박스 값 년 월 일 생성
		for(int i = 2000; i <= 2030; i++)
			petYear.addItem(i);
		for(int i = 1; i<= 12; i++)
			petMonth.addItem(i);
		//월에 맞는 일 생성해야함
		for(int i = 1; i<= 31; i++)
			petDate.addItem(i);

		//종 콤보박스 기본 값
		petSpecies.addItem("선택하세요");

		nameP.add(new JLabel("이름 :            "));
		nameP.add(pfName);
		speciesP.add(new JLabel("종 :     "));
		speciesP.add(speciesList);  
		speciesP.add(petSpecies);
		genderP.add(new JLabel("성별 :         "));
		genderP.add(petMale);
		genderP.add(petFemale);
		yearP.add(new JLabel("생일 :         "));
		yearP.add(petYear);
		yearP.add(new JLabel(" 년"));
		yearP.add(petMonth);
		yearP.add(new JLabel(" 월"));
		yearP.add(petDate);
		yearP.add(new JLabel(" 일"));
		buttonP.add(addButton);
		buttonP.add(resetButton);

		add(infoL);
		add(nameP);
		add(genderP);
		add(speciesP);
		add(yearP);
		add(buttonP);

		setVisible(true);

		//무명클래스 이벤트 처리기
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveProfile.name = getPfName(); // 이름 등록 안한경우 null값
				saveProfile.gender= getPfGender(); //(수컷은 0 , 암컷은 1, 선택안된경우 -1)
				saveProfile.birthday = getPfBirthday();
				saveProfile.species = getPfSpecies();
				saveProfile.age = (Today.tYear - getPfBirthday().years + 1) + "";
				saveProfile.create = true;
				saveProfile.saveFile();
				JOptionPane.showMessageDialog(null, "                               등록완료", " 안내", JOptionPane.PLAIN_MESSAGE);
				dispose();
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ys = JOptionPane.showConfirmDialog(null, "  프로필이 초기화 됩니다.", " 경고", JOptionPane.YES_NO_OPTION);
			        if(ys == JOptionPane.YES_OPTION){
			        	saveProfile.name = null; // 이름 등록 안한경우 null값
						saveProfile.gender = -1; //(수컷은 0 , 암컷은 1, 선택안된경우 -1)
						saveProfile.birthday = null;
						saveProfile.species = null;
						saveProfile.age = null;
						saveProfile.create = false;
			        	reset();
			        }	
			}
		});

		speciesList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(speciesList.getSelectedIndex()==0) {
					petSpecies.removeAllItems();
					petSpecies.addItem("골든리트리버");
					petSpecies.addItem("사모예드");
					petSpecies.addItem("보더콜리");
					petSpecies.addItem("웰시코기");
					petSpecies.addItem("닥스훈트");
					petSpecies.addItem("비숑프리제");
					petSpecies.addItem("말티즈");
					petSpecies.addItem("치와와");
					petSpecies.addItem("퍼그");
					petSpecies.addItem("요크셔테리어");
					petSpecies.addItem("도베르만");
					petSpecies.addItem("시츄");
					petSpecies.addItem("기타");
				}
				if(speciesList.getSelectedIndex()==1) {
					petSpecies.removeAllItems();
					petSpecies.addItem("먼치킨");
					petSpecies.addItem("뱅갈");
					petSpecies.addItem("브리티시숏헤어");
					petSpecies.addItem("아비시니안");
					petSpecies.addItem("스핑크스");
					petSpecies.addItem("러시안블루");
					petSpecies.addItem("페르시안");
					petSpecies.addItem("랙돌");
					petSpecies.addItem("노르웨이숲");
					petSpecies.addItem("샴");
					petSpecies.addItem("메인쿤");
					petSpecies.addItem("터키시앙고라");
					petSpecies.addItem("기타");
				}
			}
		});
	}
	//입력한 이름 리턴 메소드
	public String getPfName() {
		if(pfName.getText().length() == 0) return null;
		else return pfName.getText();
	}
	//입력한 성별 리턴 메소드 (수컷은 0 , 암컷은 1, 선택안된경우 -1)
	public int getPfGender() {
		if(petMale.isSelected())
			return 0;
		else if(petFemale.isSelected())
			return 1;
		else
			return -1;
	}
	//입력한 종 리턴 메소드
	public String getPfSpecies() {
		return (String) petSpecies.getSelectedItem();
	}
	//입력한 생일 리턴 메소드
	public Day getPfBirthday() {
		int year = (int)petYear.getSelectedItem();
		int month = (int)petMonth.getSelectedItem();
		int date = (int)petDate.getSelectedItem();
		return new Day(year, month, date);
	}
	//나머지 입력값을 리턴하는 메소드 만들어야함
	
	//등록한 프로필 초기화하는 함수
	public void reset(){
		File file = new File("profile.txt");
		if(file.exists()) 
			file.delete();
	}
}
