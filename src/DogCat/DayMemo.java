package DogCat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DayMemo{
	Frame fMemo;
	TextArea taMemo;
	Panel pMemo;
	Button bMemo1, bMemo2;
	
	private void create() {
		fMemo = new Frame();
		taMemo = new TextArea();
		pMemo = new Panel();
		bMemo1 = new Button("저장");
		bMemo2 = new Button("종료");
		
		fMemo.add(taMemo);
		fMemo.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bMemo1);
		pMemo.add(bMemo2);
		
		fMemo.setSize(300,  500);
		fMemo.setVisible(true);
	}
}
