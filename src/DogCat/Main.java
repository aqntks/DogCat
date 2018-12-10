package DogCat;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static void main(String[] args) {
		FMain fmain = new FMain();  //프레임 생성
		fmain.add(new LoadImage(0));
		fmain.pack();
		fmain.setVisible(true);
	}
}
