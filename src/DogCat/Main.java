package DogCat;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static void main(String[] args) {
		FMain fmain = new FMain();  //������ ����
		fmain.add(new LoadImage(0));
		fmain.pack();
		fmain.setVisible(true);
	}
}
