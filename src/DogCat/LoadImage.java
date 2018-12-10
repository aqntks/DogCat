package DogCat;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LoadImage extends JPanel{
	BufferedImage img;

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	public LoadImage(int whatImg) { // 메인 메뉴 사진
		try {
			switch(whatImg) {
			case 0: //메인메뉴 이미지
				img = ImageIO.read(new File("mypetdiary.jpg"));
				break;
			case 1:  //종 메뉴 이미지
				img = ImageIO.read(new File("main_icon.gif"));
				break;
			}

		}
		catch(IOException e) {}
	}
	public LoadImage(int species, String whatImg) { //종 사진 (강아지 = 0 고양이 1)
		try {
			if(species == 0) {
				switch(whatImg) {
				case "골든리트리버": //메인메뉴 이미지
					img = ImageIO.read(new File("GoldenRetriever.jpg"));
					break;
				case "사모예드":  //종 메뉴 이미지
					img = ImageIO.read(new File("Samoyed.jpg"));
					break;
				case "보더콜리":
					img = ImageIO.read(new File("BorderCollie.jpg"));
					break;
				case "웰시코기":
					img = ImageIO.read(new File("welshCorgi.jpg"));
					break;
				case "닥스훈트":
					img = ImageIO.read(new File("Dachshund.jpg"));
					break;
				case "비숑프리제":
					img = ImageIO.read(new File("BichonFrise.jpg"));
					break;
				case "말티즈":
					img = ImageIO.read(new File("Maltese.jpg"));
					break;
				case "치와와":
					img = ImageIO.read(new File("Chihuuahua.jpg"));
					break;
				case "퍼그":
					img = ImageIO.read(new File("Pug.jpg"));
					break;
				case "요크셔테리어":
					img = ImageIO.read(new File("YorkshireTerrier.jpg"));
					break;
				case "도베르만":
					img = ImageIO.read(new File("Dobermann.jpg"));
					break;
				case "시츄":
					img = ImageIO.read(new File("ShihTzu.jpg"));
					break;
				}
			}
			if(species == 1) {
				switch(whatImg) {
				case "먼치킨":
					img = ImageIO.read(new File("먼치킨.jpg"));
					break;
				case "뱅갈":
					img = ImageIO.read(new File("뱅갈.jpg"));
					break;
				case "브리티시숏헤어":
					img = ImageIO.read(new File("브리티시숏헤어.jpg"));
					break;
				case "아비시니안":
					img = ImageIO.read(new File("아비시니안.jpg"));
					break;
				case "스핑크스":
					img = ImageIO.read(new File("스핑크스.jpg"));
					break;
				case "러시안블루":
					img = ImageIO.read(new File("러시안블루.jpg"));
					break;
				case "페르시안":
					img = ImageIO.read(new File("페르시안.jpg"));
					break;
				case "랙돌":
					img = ImageIO.read(new File("랙돌.jpg"));
					break;
				case "노르웨이숲":
					img = ImageIO.read(new File("노르웨이숲.jpg"));
					break;
				case "샴":
					img = ImageIO.read(new File("샴.jpg"));
					break;
				case "메인쿤":
					img = ImageIO.read(new File("메인쿤.jpg"));
					break;
				case "터키시앙고라":
					img = ImageIO.read(new File("터키시앙고라.jpg"));
					break;
				}
			}

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