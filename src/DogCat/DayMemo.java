package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DayMemo extends JFrame implements ActionListener{
	private JTextArea taMemo;
	private JPanel pMemo;
	private JButton bSaveMemo, bCloseMemo;
	private JMenuBar mbMemo;
	private JMenu menuMemo;
	private JMenuItem saveMenu, closeMenu;
	public Day day;

	public DayMemo(Day day) {
		//어느 날짜의 메모인지 정보
		this.day = day;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "년" + day.months + "월" + day.days + "일");  //프레임 이름

		//기록 창
		taMemo = new JTextArea();
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
			SaveMemo.save(this, day);
		}
		if(e.getSource() == closeMenu || e.getSource() == bCloseMemo)
			dispose();
	}
}
