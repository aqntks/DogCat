package DogCat;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LoadImageApp2 extends JPanel{
	BufferedImage img;

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	public LoadImageApp2() {
		try {
			img = ImageIO.read(new File("mypetdiary.jpg"));
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