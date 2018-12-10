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
	public LoadImage(int whatImg) { // ���� �޴� ����
		try {
			switch(whatImg) {
			case 0: //���θ޴� �̹���
				img = ImageIO.read(new File("mypetdiary.jpg"));
				break;
			case 1:  //�� �޴� �̹���
				img = ImageIO.read(new File("main_icon.gif"));
				break;
			}

		}
		catch(IOException e) {}
	}
	public LoadImage(int species, String whatImg) { //�� ���� (������ = 0 ����� 1)
		try {
			if(species == 0) {
				switch(whatImg) {
				case "��縮Ʈ����": //���θ޴� �̹���
					img = ImageIO.read(new File("GoldenRetriever.jpg"));
					break;
				case "��𿹵�":  //�� �޴� �̹���
					img = ImageIO.read(new File("Samoyed.jpg"));
					break;
				case "�����ݸ�":
					img = ImageIO.read(new File("BorderCollie.jpg"));
					break;
				case "�����ڱ�":
					img = ImageIO.read(new File("welshCorgi.jpg"));
					break;
				case "�ڽ���Ʈ":
					img = ImageIO.read(new File("Dachshund.jpg"));
					break;
				case "���������":
					img = ImageIO.read(new File("BichonFrise.jpg"));
					break;
				case "��Ƽ��":
					img = ImageIO.read(new File("Maltese.jpg"));
					break;
				case "ġ�Ϳ�":
					img = ImageIO.read(new File("Chihuuahua.jpg"));
					break;
				case "�۱�":
					img = ImageIO.read(new File("Pug.jpg"));
					break;
				case "��ũ���׸���":
					img = ImageIO.read(new File("YorkshireTerrier.jpg"));
					break;
				case "��������":
					img = ImageIO.read(new File("Dobermann.jpg"));
					break;
				case "����":
					img = ImageIO.read(new File("ShihTzu.jpg"));
					break;
				}
			}
			if(species == 1) {
				switch(whatImg) {
				case "��ġŲ":
					img = ImageIO.read(new File("��ġŲ.jpg"));
					break;
				case "��":
					img = ImageIO.read(new File("��.jpg"));
					break;
				case "�긮Ƽ�ü����":
					img = ImageIO.read(new File("�긮Ƽ�ü����.jpg"));
					break;
				case "�ƺ�ôϾ�":
					img = ImageIO.read(new File("�ƺ�ôϾ�.jpg"));
					break;
				case "����ũ��":
					img = ImageIO.read(new File("����ũ��.jpg"));
					break;
				case "���þȺ��":
					img = ImageIO.read(new File("���þȺ��.jpg"));
					break;
				case "�丣�þ�":
					img = ImageIO.read(new File("�丣�þ�.jpg"));
					break;
				case "����":
					img = ImageIO.read(new File("����.jpg"));
					break;
				case "�븣���̽�":
					img = ImageIO.read(new File("�븣���̽�.jpg"));
					break;
				case "��":
					img = ImageIO.read(new File("��.jpg"));
					break;
				case "������":
					img = ImageIO.read(new File("������.jpg"));
					break;
				case "��Ű�þӰ��":
					img = ImageIO.read(new File("��Ű�þӰ��.jpg"));
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