package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DayMemo extends JFrame implements ActionListener{
	private JTextArea taMemo;
	private JPanel pMemo;
	private JButton bSaveMemo, bCloseMemo;
	private JMenuBar mbMemo;
	private JMenu menuMemo;
	private JMenuItem saveMenu, closeMenu;
	public Day yearMonth;
	public Day day;
	private File file;



	public DayMemo(Day day) {
		//어느 날짜의 메모인지 정보
		this.day = day;
		file = new File(day.print() + ".txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //프레임 사이즈
		setLocation(1200, 500);  //프레임 생성 위치
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "년 " + day.months + "월 " + day.days + "일");  //프레임 이름

		//기록 창
		taMemo = new JTextArea();


		//파일 읽기
		if(file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String str = br.readLine();
				while(str != null){
					taMemo.setText(str);
					str = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("에러 발생");
			} catch (IOException e) {
				System.out.println("에러 발생");
			}
		}



		//하단 판넬
		pMemo = new JPanel();
		//상단 메뉴 바 
		mbMemo = new JMenuBar();
		menuMemo = new JMenu("메뉴");
		//상단 메뉴 내 기능
		saveMenu = new JMenuItem("저장");
		closeMenu =new JMenuItem("종료");
		//하단 저장, 종료 버튼
		bSaveMemo = new JButton("저장");
		bCloseMemo = new JButton("종료");

		this.add(taMemo);
		this.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bSaveMemo);
		pMemo.add(bCloseMemo);

		this.setJMenuBar(mbMemo);
		//메뉴 메뉴 추가
		mbMemo.add(menuMemo);
		//메뉴 내 기능
		menuMemo.add(saveMenu);
		menuMemo.add(closeMenu);

		bSaveMemo.addActionListener(this);
		bCloseMemo.addActionListener(this);
		saveMenu.addActionListener(this);
		closeMenu.addActionListener(this); 

		setVisible(true);

	}
	//로드용 생성자
	public DayMemo(DayMemo dm) {
		//어느 날짜의 메모인지 정보
		this.day = dm.day;
		file = new File(day.print() + ".txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //프레임 사이즈
		setLocation(1200, 500);  //프레임 생성 위치
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "년 " + day.months + "월 " + day.days + "일");  //프레임 이름



		//기록 창
		taMemo = SaveMemo.getMemo(day).taMemo;
		//파일 읽기
		if(file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String str = br.readLine();
				while(str != null){
					taMemo.setText(str);
					str = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("에러 발생");
			} catch (IOException e) {
				System.out.println("에러 발생");
			}
		}

		//하단 판넬
		pMemo = new JPanel();
		//상단 메뉴 바 
		mbMemo = new JMenuBar();
		menuMemo = new JMenu("메뉴");
		//상단 메뉴 내 기능
		saveMenu = new JMenuItem("저장");
		closeMenu =new JMenuItem("종료");
		//하단 저장, 종료 버튼
		bSaveMemo = new JButton("저장");
		bCloseMemo = new JButton("종료");

		this.add(taMemo);
		this.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bSaveMemo);
		pMemo.add(bCloseMemo);

		this.setJMenuBar(mbMemo);
		//메뉴 메뉴 추가
		mbMemo.add(menuMemo);
		//메뉴 내 기능
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
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(taMemo.getText()+" ");
				bw.close(); 
			} catch (IOException eI) {
				System.out.println("에러 발생");
			}

			SaveMemo.save(this, day);
			JOptionPane.showMessageDialog(this, "                               저장완료", " 안내", JOptionPane.PLAIN_MESSAGE);
		}
		if(e.getSource() == closeMenu || e.getSource() == bCloseMemo)
			dispose();
	}
}
