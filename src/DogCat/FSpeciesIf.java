package DogCat;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FSpeciesIf extends JFrame{
	JLabel informationL = new JLabel();

	public FSpeciesIf(String species) {
		informationL = new JLabel();

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(600,600);  //������ ������
		setLocation(700, 300);  //������ ���� ��ġ
		setTitle(species);  //������ �̸�

		String blank = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
		switch(species) {
		case "��Ƽ��":
			informationL.setText("<html><body>"
					+ "Ư¡ : �۾����̳� ��ɰ��� �̿�Ǵ� ���簡 ���� Ÿ�� �ֿϰ�.<br>"
					+ blank +  "���鿡 ��ũ ���� ������ �ִ� �Ǹ� �������� ������ ����.<br>"
					+ blank + "����İ� ���׶� ���� Ư¡�̴�.<br><br>"
					+ "���� : �����̰� ���, Ȱ���ϰ� ��� ��Ȱ�� �ֿϰ�. ���� ���� ��︮�� �ʰ� �밨�ϴ�.<br>"
					+ blank + "����� ������ �ΰ��ϰ� �����ϰ� ����� �ɼ��� �鵵 �ִ�.<br><br>"
					+ "�ɾ� ��� : ����� �ٸ� �������� �����Ѵ�. ������ ���� �Ĳ��ϰ� �Ѵ�.<br>"
					+ blank + "��, �� ������ �׻� û���ϰ�. ��⼺�� ���� ���� �͸� üũ�ϴ� �͵� �߿��ϴ�."
					+ "</body></html>");
			break;
		case "��ũ���׸���":
			informationL.setText("<html><body>"
					+ "Ư¡ : ���� ��ũ�� ���濡�� �㸦 �����ϱ� ���ؼ� �����ϴ� ���� ����ȭ��Ų ���̴�.<br>"
					+ blank +  "���׼���� ��� �ڶ� �Ƹ��ٿ� �Ǹ� �߿��ϰ� �����.<br><br>"
					+ "���� : ������ �����ϰ� �������� ��ģ��. �׸��� Ư���� �ݷ��� ������ ���������� ���� ������<br>"
					+ blank + "���� �ܿ��� ����̱� ����� ��쵵 �ִ�. <br>"
					+ blank + "'������ ���Ѵ�'��� ǥ���� ������ ǥ���� ǳ���ϴ�.<br><br>"
					+ "�ɾ� ��� : �Ǹ� �ſ� �Ƹ������� �����ϱⰡ ��ƴ�. �������� �⸣�� ����� ª�� �߶��ش�.<br>"
					+ blank + "��Ʈ������ ���̱� ����Ƿ� ª�� �ð��̶� ���� ��å ��Ű�� ���� ����."
					+ "</body></html>");
			break;
		case "����":
			informationL.setText("<html><body>"
					+ "Ư¡ : Ƽ�� ����� ��� �мҿ� ��Ű������ ȥ���� �˷��� �ִ� �߱� ����� ��.<br>"
					+ blank + "�߱���� '����'�� �̸��� �����̴�. ª�� �ڰ� Ư¡�̴�. ���� ưư�ؼ� Ű��� ����.<br><br>"
					+ "���� : �۾��ߵ� ��ɰߵ� �ƴϱ� ������ �����ϰ� ����� �ſ� ������.<br>"
					+ blank + "���ɵ� ������� ���� ���� ������ �������� Ű��� ���� �͵� �����̴�.<br><br>"
					+ "�ɾ� ��� : �����̴� ���� �����ϹǷ� ���� ���� ��� ��Ű�� ������ �Ÿ��� �ʴ´�.<br>"
					+ blank + "���� �翡 �ְ� �;� �ϹǷ� �ʹ� ����θ��� �ʵ��� �����Ѵ�."
					+ "</body></html>");
			break;
		case "���޶�Ͼ�":
			informationL.setText("<html><body>"
					+ "Ư¡ : �����̰� ��ü�� ª���� ���� ������ � �ö�Ÿ�� ���� �ִ�. �Ǹ�� �ε巴�� ǳ���ϴ�. <br>"
					+ blank + "���� �ܴ������� ����� ���ø�, Ư�� ������ ��������.<br><br>"
					+ "���� : ���� ������ ����ȭ�ϴ� �������� �Ű������� ���� ��Ÿ���ٰ� �ϴµ�, <br>"
					+ blank + "���޶�Ͼȵ� �Ű������̰� ȣ�����̴�. <br>"
					+ blank + "���� �ܿ��� ���� ��鿩���� �ʰ�, ū ��뿡�Ե� �� ¢�´�.<br><br>"
					+ "�ɾ� ��� : �Ű������� ���� ��Ÿ���� �ٷ�� ��������Ƿ� �Ʒ��� ö���� �Ѵ�. <br>"
					+ blank + "������ ���� �Ĳ��ϰ�. �񸸿���, ������ ���� ��å�� Ȯ���ϰ� �Ѵ�.<br>"
					+ blank + "�Ű������� ���� �ʵ��� ��å�� ���� ��Ų��."
					+ "</body></html>");
			break;
		case "ġ�Ϳ�":
			break;
		case "�����ڱ�":
			break;
		case "��������":
			break;
		case "�ڽ���Ʈ":
			break;
		case "�۱�":
			break;
		case "Ǫ��":
			break;
		case "��Ű����":
			break;
		case "�̴���":
			break;
		case "���߿�":
			informationL.setText("<html><body>"
					+ "Ư¡ : <br>"
					+ blank + "<br><br>"
					+ "���� : <br>"
					+ blank + "<br>"
					+ blank + "<br><br>"
					+ "�ɾ� ��� : <br>"
					+ blank + ""
					+ "</body></html>");
			break;
		}

		add(informationL);

		setVisible(true);
	}
}
