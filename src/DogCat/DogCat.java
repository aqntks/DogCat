package DogCat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class LoadImageApp extends JPanel{
	BufferedImage img;

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	public LoadImageApp() {
		try {
			img = ImageIO.read(new File("main_icon.gif"));
		}
		catch(IOException e) {}
	}
	public Dimension getPreferredSize() {
		if(img == null) {
			return new Dimension(100, 100);
		}
		else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
}

public class DogCat extends JFrame {
	public DogCat(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,300);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DogCat");
		Image img = kit.getImage("main_icon.gif");
		setIconImage(img);
		setVisible(true);

		setLayout(new FlowLayout());
		JButton dogButton = new JButton("港港捞");
		JButton catButton = new JButton("成成捞");
		this.add(dogButton);
		this.add(catButton);
		setVisible(true);
	}

	public static void main(String[] args) {
		DogCat dogcat = new DogCat();
		
		dogcat.add(new LoadImageApp());
		dogcat.pack();
		dogcat.setVisible(true);
		dogcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
