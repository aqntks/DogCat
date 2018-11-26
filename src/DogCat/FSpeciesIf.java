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

		setSize(600,600);  //프레임 사이즈
		setLocation(700, 300);  //프레임 생성 위치
		setTitle(species);  //프레임 이름

		String blank = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
		switch(species) {
		case "말티즈":
			informationL.setText("<html><body>"
					+ "특징 : 작업견이나 사냥개로 이용되던 역사가 없는 타고난 애완견.<br>"
					+ blank +  "순백에 실크 같은 광택이 있는 피모를 가졌으며 밑털이 없다.<br>"
					+ blank + "새까맣고 동그란 눈도 특징이다.<br><br>"
					+ "성격 : 지적이고 우아, 활발하고 밝고 쾌활한 애완견. 작은 몸에 어울리지 않게 용감하다.<br>"
					+ blank + "사람의 마음을 민감하게 감지하고 어리광이 능숙한 면도 있다.<br><br>"
					+ "케어 방법 : 목욕은 다른 견종보다 자주한다. 빗질은 매일 꼼꼼하게 한다.<br>"
					+ blank + "눈, 입 주위는 항상 청결하게. 통기성이 좋지 않은 귀를 체크하는 것도 중요하다."
					+ "</body></html>");
			break;
		case "요크셔테리어":
			informationL.setText("<html><body>"
					+ "특징 : 영국 요크셔 지방에서 쥐를 구제하기 위해서 사육하던 개를 소형화시킨 것이다.<br>"
					+ blank +  "도그쇼에서는 길게 자란 아름다운 피모를 중요하게 여긴다.<br><br>"
					+ "성격 : 감각이 예민하고 에너지가 넘친다. 테리어 특유의 격렬한 기질과 고집스러운 성격 때문에<br>"
					+ blank + "주인 외에는 길들이기 어려운 경우도 있다. <br>"
					+ blank + "'눈으로 말한다'라고 표현할 정도로 표정이 풍부하다.<br><br>"
					+ "케어 방법 : 피모가 매우 아름답지만 손질하기가 어렵다. 가정에서 기르는 경우라면 짧게 잘라준다.<br>"
					+ blank + "스트레스가 쌓이기 쉬우므로 짧은 시간이라도 매일 산책 시키는 것이 좋다."
					+ "</body></html>");
			break;
		case "시츄":
			informationL.setText("<html><body>"
					+ "특징 : 티벳 출신의 라사 압소와 페키니즈의 혼혈로 알려져 있는 중국 출신의 개.<br>"
					+ blank + "중국어로 '사자'가 이름의 유래이다. 짧은 코가 특징이다. 몸이 튼튼해서 키우기 쉽다.<br><br>"
					+ "성격 : 작업견도 사냥견도 아니기 때문에 온후하고 사람을 매우 따른다.<br>"
					+ blank + "경계심도 헛울음도 거의 없기 때문에 가정에서 키우기 쉬운 것도 장점이다.<br><br>"
					+ "케어 방법 : 움직이는 것을 좋아하므로 매일 많은 운동을 시키고 빗질도 거르지 않는다.<br>"
					+ blank + "주인 곁에 있고 싶어 하므로 너무 어리광부리지 않도록 주의한다."
					+ "</body></html>");
			break;
		case "포메라니안":
			informationL.setText("<html><body>"
					+ "특징 : 소형이고 동체가 짧으며 말린 꼬리가 등에 올라타듯 뻗어 있다. 피모는 부드럽고 풍성하다. <br>"
					+ blank + "몸은 단단하지만 골격이 가늘며, 특히 사지가 가냘프다.<br><br>"
					+ "성격 : 대형 견종을 소형화하는 과정에서 신경질적인 면이 나타난다고 하는데, <br>"
					+ blank + "포메라니안도 신경질적이고 호전적이다. <br>"
					+ blank + "가족 외에는 쉽게 길들여지지 않고, 큰 상대에게도 잘 짖는다.<br><br>"
					+ "케어 방법 : 신경질적인 면이 나타나면 다루기 힘들어지므로 훈련을 철저히 한다. <br>"
					+ blank + "빗질은 매일 꼼꼼하게. 비만예방, 여름의 더위 대책을 확실하게 한다.<br>"
					+ blank + "신경질적이 되지 않도록 산책은 매일 시킨다."
					+ "</body></html>");
			break;
		case "치와와":
			break;
		case "웰시코기":
			break;
		case "슈나우저":
			break;
		case "닥스훈트":
			break;
		case "퍼그":
			break;
		case "푸들":
			break;
		case "페키니즈":
			break;
		case "미니핀":
			break;
		case "빠삐용":
			informationL.setText("<html><body>"
					+ "특징 : <br>"
					+ blank + "<br><br>"
					+ "성격 : <br>"
					+ blank + "<br>"
					+ blank + "<br><br>"
					+ "케어 방법 : <br>"
					+ blank + ""
					+ "</body></html>");
			break;
		}

		add(informationL);

		setVisible(true);
	}
}
