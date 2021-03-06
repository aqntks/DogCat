package DogCat;

import java.awt.BorderLayout;
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
		setLocation(300, 100);  //프레임 생성 위치
		setTitle(species);  //프레임 이름

		setLayout(new BorderLayout());
		
		
		String blank = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
		switch(species) {
		case "골든리트리버":
			informationL.setText("<html><body>"
					+ "원산지 : 영국 <br> 체고 : 51~61cm <br> 체중 : 27~36kg <br> 크기 : 대형<br>"
					+ "외모 : 건실하고 기민하고 자신감이 있어 보이며 황금색털이 매력적<br>"
					+ "성격 : 친밀하며 믿음 있고 애정이 깊으며 확실한 성품<br>"
					+ "추천성향 : 단독주택, 어린이, 운동량 많음<br>"
					+ "주요유의질병 : 관절염, 비만, 지루성피부염, 음식알레르기, 탈모증, 백선, 백내장<br>"
					+ "색상 : 황금색<br>"
					+ "그룹구분 : 스포팅 (일반적으로 조렵견을 의미)<br>"
					+ "친화성 : 높음<br> 털빠짐 : 많음 <br> 집지키기 : 부적절 <br> 실내외구분 : 실외 <br><br>"
					+ "모색은 골드와 크림색이 있으며 구불거리며 단색인 털이 수수한 아름다움이 있다.<br> "
					+ "이중모의 구조기 때문에 봄에 속털이 빠지므로 이 시기에 솔질을 자주 해주어 빠진 털을 제거하여 피부병을 예방하고,<br>"
					+ "워낙 얌전한 개이므로 인위적인 운동을 시켜 비만을 방지해야 한다.<br>"
					+ "이 개의 성격은 좋게 얘기하면 양반이고, 나쁘게 얘기하면 천하태평 현실 도피자라고나 할까?<br> "
					+ "이 개의 활동 분야의 특성을 보면 알 수 있듯이, 죽을 때까지 맹인의 안내를 하고, <br>"
					+ "무언가를 집어 오라고 하면 땅이건 물이건 간에 무조건 찾아오는 이 개는 다른개와 다르게<br>"
					+ "어떻게 하면 다른 사람을 물지 않게 복종 훈련을 시키나의 개념이 아니라,<br>"
					+ "어떻게 하면 이 개를 화나게 해서 사람을 물거나 으르렁 거리게 할수 있을까를 고민하게 만드는 개이다.<br>"
					+ "공간만 있는 집이면 어느 가정이라도 100% 어울리는 개이다."
					+ "</body></html>");
			break;
		case "사모예드":
			informationL.setText("<html><body>"
					+ "원산지 : 러시아 <br> 체고 : 45~55cm <br> 체중 : 23~30kg <br> 크기 : 중형<br>"
					+ "외모 : 근육질에 가슴은 깊고 다리가 적당히 길며 알맞게 굽은 뒷무릎<br>"
					+ "성격 : 총명, 충직하고 역동적이며 우호적이며 적응을 잘함<br>"
					+ "추천성향 : 단독주택/전원주택, 어린이/젊은층/노년층, 운동량 많음<br>"
					+ "주요유의질병 : 당뇨, 백내장<br>"
					+ "색상 : 흰색 미색<br>"
					+ "그룹구분 : 워킹 (일반적으로 사역견을 의미)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 많음 <br> 집지키기 : 부적절 <br> 실내외구분 : 실외<br><br>"
					+ "흰백색의 털과 입 끝 부분이 살짝 올라가서 생기는 미소가 특징이다.<br> "
					+ "순록의 사냥과 순록의 보호, 썰매 끌기 등 이누이트인들에게는 없어서는 안될 중요한 개이며<br>"
					+ "지금은 특유의 신비스러운 미소와 백색의 털로 인해 훌륭한 가정견과 쇼독으로 인기가 있다. <br>"
					+ "일반적인 개들은 사람들하고 지내왔으나 이 견종은 썰매를 끌기 위해 같은 종끼리 생활을 많이 해왔기 때문에<br> "
					+ "서열 정하기에 민감하며 다른 견종에 대하여는 배타적이다.<br>"
					+ "추위에는 강하나 더위에는 상당히 약하므로 옥외견의 경우 개집의 위치와 통풍에 신경을 써야한다"
					+ "</body></html>");
			break;
		case "보더콜리":
			informationL.setText("<html><body>"
					+ "원산지 : 영국 <br> 체고 : 45~53cm <br> 체중 : 18~23kg <br> 크기 : 중형<br>"
					+ "외모 : 좋은 균형의 강건한 외형을 가진 견종<br>"
					+ "성격 : 활력적이고 민첩하며 의욕적이고 친구에게 다정함<br>"
					+ "추천성향 : 단독주택/전원주택, 어린이/젊은층/노년층, 운동량 많음<br>"
					+ "주요유의질병 : 결막염, 각막염, 간질<br>"
					+ "색상 : 검은색 황갈색&흰색 블루멀<br>"
					+ "그룹구분 : 허딩 (일반적인 의미의 목축견)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 많음 <br> 집지키기 : 뛰어남 <br> 실내외구분 : 실외<br><br>"
					+ "이 개들은 자주 “농장의 양치는 개”, “일하는 양치는 개”들로 불러지며,<br> "
					+ "농부와 목양하는 사람들을 돕는 일을 잘 하는 개로 남아 있다.<br>"
					+ "보더 콜리는 잡일이 주어지거나 이들의 힘을 분출시킬 때 가장 행복하다.<br>"
					+ "활력적이고 민첩하며 의욕적이다.<br> "
					+ "친구에 대하여 다정하고, 낯선 이들에게는 상당히 냉담할 수 있을지도 모르지만 그렇기 때문에 훌륭한 경비견이 된다.<br>"		
					+ "영특함은 이 견종이 갖는 최대의 특성이다."
					+ "</body></html>");
			break;
		case "웰시코기":
			informationL.setText("<html><body>"
					+ "원산지 : 영국 <br> 체고 : 25~30.5cm <br> 체중 : 13kg정도 <br> 크기 : 중형<br>"
					+ "외모 : 낮게 위치하며 튼튼하고 단단하고 작게 형성됨<br>"
					+ "성격 : 자신감 있고 친절하며 수줍거나 사납지 않음<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 많음<br>"
					+ "주요유의질병 : 각막염, 결막염, 척추디스크<br>"
					+ "색상 : 붉은색 세이블 검은색&황갈색 황갈색 흰반점<br>"
					+ "그룹구분 : 허딩 (일반적인 의미의 목축견)<br>"
					+ "친화성 : 보통 <br> 털빠짐 : 보통 <br> 집지키기 : 보통 <br> 실내외구분 : 실내, 실외<br><br>"
					+ "그들은 다리가 짧은 가축몰이 개로서 가축들의 다리 사이로 달릴 수 있게 개발되었고, <br> "
					+ "가축들의 뒷발에 차이는 위험을 피할 수 있었다.<br>"
					+ "낮게 위치하고 튼튼하고 단단하게 형성되어 활동적이며,<br>"
					+ "작은 크기 안의 실질과 체력의 느낌을 주는 견종이다.<br> "
					+ " 자신감 있으나 친절하다. 수줍거나 사납지 않다. <br>"
					+ " 심사위원은 너무 과하게 수줍음을 타는 펨브로크 웰시 코기는 링에서 제외해야 한다."
					+ "</body></html>");
			break;
		case "닥스훈트":
			informationL.setText("<html><body>"
					+ "원산지 : 독일 <br> 체고 : 13~25cm <br> 체중 : 5kg이하 <br> 크기 : 소형<br>"
					+ "외모 : 몸은 길고 다리는 짧으며 근육이 있고 가죽은 탄력이 있고 나긋함<br>"
					+ "성격 : 명랑하고 장난스럽고 헛짖음과 무는 성질이 강함<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 외이염, 백내장, 척추디스크, 비만<br>"
					+ "색상 : 붉은색 적갈색 검은색 황갈색 초콜릿색&황갈색 블린들<br>"
					+ "그룹구분 : 하운드 (일반적인 의미의 수렵견)<br>"
					+ "친화성 : 보통 <br> 털빠짐 : 보통 <br> 집지키기 : 보통 <br> 실내외구분 : 실내, 실외<br><br>"
					+ "닥스훈트라는 이름은 독일어의 '오소리 사냥' 이라는 뜻이 담겨져 있으며 초기에는 '테켈(teckel)'이라고 불렸었다.<br> "
					+ "굴에 숨은 오소리나 여우를 끌어내고 토끼를 추적하는데 활약했던 특징이 외형적으로도 나타난다.<br>"
					+ "다리가 짧고 몸이 길며 후각이 발달되어 있으며 겁이 없는 편이다.<br>"
					+ "몸이 길어 체중 조절과 운동에 신경 써 주지 않으면 척추 디스크를 유발하기 쉽다.<br> "
					+ "명랑하고 장난스러운 성격으로 활동하는 것을 좋아하며 주인의 말을 잘 이해해 좋은 친구로 지내기 적합하다.<br>"
					+ "반면에 헛짖음이나 무는 성질이 높고 배변 가리는 습관을 들이기가 어려우므로 <br>"
					+ "처음부터 단호하게 훈련을 시켜둘 필요가 있다."
					+ "</body></html>");
			break;
		case "비숑프리제":
			informationL.setText("<html><body>"
					+ "원산지 : 프랑스, 벨기에 <br> 체고 : 23~31cm <br> 체중 : 5~10kg <br> 크기 : 소형<br>"
					+ "외모 : 흰 솜사탕 같은 외모와 작고 단단한 외관<br>"
					+ "성격 : 독립심이 강하며 세심하고 친밀하며 명랑함<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 백내장, 간질<br>"
					+ "색상 : 흰색 미색 살구색<br>"
					+ "그룹구분 : 논스포팅 (일반적인 의미의 비수렵견, 실용견)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 적음 <br> 집지키기 : 부적절 <br> 실내외구분 : 실내, 실외<br><br>"
					+ "곱슬거리는 털을 가졌다는 뜻의 '비숑 프리제'라는 이름처럼 뛰어난 털을 가지고 있으며 매우 튼튼한 체질의 견종으로<br> "
					+ "마치 인형 같은 느낌을 주어 프랑스 여성들 사이에서 인기 1위를 차지한다. <br>"
					+ "푸들과 같이 활발한 반면 독립심이 강해 혼자 집을 지키게 해도 얌전히 있으며 주인의 말과 행동을 민감하게 받아들인다.<br>"
					+ "훈련 성능이 대단히 높아 가정견으로 적합하다.<br> "
					+ "비단결 같은 털이 곱슬거리고, 겉털은 5cm 이상으로 자란다.<br>"
					+ " 우아한 털을 아름답게 유지하려면 꼼꼼한 손질이 필요하다. <br>"
					+ "그래서 머리 손질법을 알아 두는 것이 중요하다"
					+ "</body></html>");
			break;
		case "말티즈":
			informationL.setText("<html><body>"
					+ "원산지 : 이탈리아 <br> 체고 : 26cm이하 <br> 체중 : 2~3kg <br> 크기 : 소형<br>"
					+ "외모 : 코는 점점 까매지고 순백의 비단같은 털이 온몸에 덮여 있음<br>"
					+ "성격 : 몹시 까다롭고 활달하며 질투와 응석이 있고 사람들과 친밀하게 지냄<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 심장판막증, 심장마비, 결막염, 각막염, 비만<br>"
					+ "색상 : 흰색<br>"
					+ "그룹구분 : 토이 (일반적으로 애완견을 의미)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 보통 <br> 집지키기 : 보통 <br> 실내외구분 : 실내<br><br>"
					+ "이들은 몹시 까다롭고, 세련되고 충실한 개이다. 주인에게 충실한 이들은 모든 사람들과 친밀하게 지낸다.<br> "
					+ "이들의 눈같이 희고 부드러운 털은 밑털이 없으므로,연례적인 털갈이 행사의 문제를 일으키지는 않지만,<br>"
					+ "털이 엉키지 않게 하기 위해서는 자주 빗어주어야 한다. <br>"
					+ "이들의 꼬리는 본래의 길이대로 우아하게 등 뒤로 말려있다. 몰티즈는 활달하며 작지만 단호하다.<br> "
					+ " 애정이 많고, 질투도 하고, 응석을 잘 부린다. 모든 사람들에게 친절한 이 개는 집도 잘 지키지만 <br>"
					+ "아이들을 자신의 라이벌로 생각하고 대드는 경향이 있으니 서열 정하기 훈련에 신경을 써야 한다."
					+ "</body></html>");
			break;
		case "치와와":
			informationL.setText("<html><body>"
					+ "원산지 : 멕시코 <br> 체고 : 13~22cm <br> 체중 : 3kg이하 <br> 크기 : 초소형<br>"
					+ "외모 : 쾌활한 표정에 다부지며 재빠르게 움직임<br>"
					+ "성격 : 기민하고 용감하고 호기심이 강한 테리어 기질이 있음<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 적음<br>"
					+ "주요유의질병 : 골절, 지루성피부염, 외이염, 충치, 구내염, 당뇨, 유루증<br>"
					+ "색상 : 황갈색 청색 초콜릿색 검은색<br>"
					+ "그룹구분 : 토이 (일반적으로 애완견을 의미)<br>"
					+ "친화성 : 보통 <br> 털빠짐 : 보통 <br> 집지키기 : 뛰어남 <br> 실내외구분 : 실내<br><br>"
					+ "치와와는 우아하고 기민하며, 재빠르게 움직이는 작은 개로서 쾌활한 표정에 다부지며,<br> "
					+ "테리어 같은 기질을 지녔다.<br>"
					+ "크기가 작기 때문에 아파트 등에서 키우기에 적합하며 노년층에 인기가 많다.<br>"
					+ " 애교가 많고 품위가 있으며, 커다란 귀는 기민해 보이는 외모를 더욱 강조해 준다.<br> "
					+ "놀이나 장난을 좋아하지 않지만 질투심이 강해 주인을 독점하기를 바라며 <br>"
					+ "다른 개와 상대할 경우에도 절대 지지 않으려는 성향이 강하다. <br>"
					+ "질투심이 많으면서도 자립심이 강해 주인이 많은 시간을 들이지 않아도 좋다."
					+ "</body></html>");
			break;
		case "퍼그":
			informationL.setText("<html><body>"
					+ "원산지 : 중국 <br> 체고 : 25~28cm <br> 체중 : 6~8.5kg <br> 크기 : 소형<br>"
					+ "외모 : 정방형에 땅딸막하고 아래턱이 위턱보다 주둥이가 나와 있음<br>"
					+ "성격 : 느긋한 성질과 주인에 대한 애정이 깊고 다정하고 인내심이 강함<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 급성기관지염, 폐렴, 지루성피부염, 각막염, 결막염, 안구탈출, 비만<br>"
					+ "색상 : 은색 살구색 황갈색 검은색<br>"
					+ "그룹구분 : 토이 (일반적으로 애완견을 의미)<br>"
					+ "친화성 : 보통 <br> 털빠짐 : 많음 <br> 집지키기 : 보통 <br> 실내외구분 : 실내<br><br>"
					+ "퍼그는 중국산 견종 중 가장 순한 개이며 온도 변화에 대한 적응력이 떨어지고<br> "
					+ "특히 더위에 약해 열사병을 주의해야 하며 먹는 것을 좋아하므로 비만해지지 않도록 주의한다.<br>"
					+ "몸에 비해 큰 머리, 킁킁거리며 의사를 전하는 들창코와 주름이 특징적이며<br>"
					+ " 털손질이나 운동을 시키지 않아도 되므로 번거로움이 적다.<br> "
					+ "다양한 표정으로 사려깊고 애교스러우면서도 개성있는 취향을 고집하므로 매우 까다로운 편이라고 할 수 있다. <br>"
					+ "가장 돋보이는 퍼그의 성격은 서두르지 않는 성미이다."
					+ "</body></html>");
			break;
		case "요크셔테리어":
			informationL.setText("<html><body>"
					+ "원산지 : 영국 <br> 체고 : 23cm정도 <br> 체중 : 3.5kg정도 <br> 크기 : 소형<br>"
					+ "외모 : 털이 길고 몸체는 깔끔하고 암팡지며 비례를 이루고 있음<br>"
					+ "성격 : 겁이 없고 활발함과 생기가 넘치며 응석을 잘 부리고 자립심이 강함<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 지루성피부염, 구토, 설사, 심장판막증, 심장마비<br>"
					+ "색상 : 암청회색&황갈색&황금색<br>"
					+ "그룹구분 : 토이 (일반적으로 애완견을 의미)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 보통 <br> 집지키기 : 뛰어남<br> 실내외구분 : 실내<br><br>"
					+ "그들의 다루기 쉬운 성격과 알코올 음료병만한 크기는 그들을 이상적인 여행의 동반자로 만들었다.<br> "
					+ "가장 작은 소형개이기 때문에 그들은 어린아이들이 가지기에는 적합하지가 않다.<br>"
					+ "전형적인 테리어의 성질을 가지고 있고 활기에 넘치고 자신감에 차 있다. <br>"
					+ "자신의 주인에게 애정을 다하고 헌신적인 이들은 위험이 닥쳤을 때 주저하지 않고 크게 경보 소리로 짖어댄다.<br> "
					+ "요크셔 테리어는 화려한 장모종의 털이 특징적이지만 하루에 한번 빗질로 번거롭지 않게 아름답고 윤기있는 모질을 유지할 수 있다.<br>"
					+ "청각이 발달해 있어 잘 짖으며 겁이 없는 편이므로 번견 성능이 높아 사랑받는 견종이다."
					+ "</body></html>");
			break;
		case "도베르만":
			informationL.setText("<html><body>"
					+ "원산지 : 독일 <br> 체고 : 65~70cm <br> 체중 : 30~40kg <br> 크기 : 대형<br>"
					+ "외모 : 사각형 모양과 근육질의 몸체와 우아하고 귀족적인 외모를 지님<br>"
					+ "성격 : 원기왕성하고 주의 깊으며 단호하고 충직하면서 순종적임<br>"
					+ "추천성향 : 단독주택/전원주택, 젊은층, 운동량 많음<br>"
					+ "주요유의질병 : 심장판막증, 심장마비<br>"
					+ "색상 : 검은색 황금색 청색 엷은황갈색 붉은색<br>"
					+ "그룹구분 : 워킹 (일반적으로 사역견을 의미)<br>"
					+ "친화성 : 보통 <br> 털빠짐 : 보통 <br> 집지키기 : 뛰어남 <br> 실내외구분 : 실외<br><br>"
					+ "19세기말 루이스 도베르만이 경호견으로 만든 견종이다. <br> "
					+ "이 개의 초기 사용 목적은 사냥터 경비원의 신변 보호를 위해 침입자를 찾아내거나 제압하는 것이었고,<br>"
					+ "지금은 초기 사용목적이 많이 줄었으나 침입자 퇴치 게임은 아직도 성행하고 있다. <br>"
					+ "조용하고 침착하다. 어린 강아지 때에는 장난을 치기도 하고 반항을 종종 하는데 이것은 훈련을 통해 시정되야 한다.<br> "
					+ "대형견 설명에서 누차 강조하지만 만일의 사태에 대비한 복종 훈련이 절대적으로 필요하다. <br>"
					+ "꼬리는 생후 일주일 이내에, 귀는 생후2~4개월에 단미, 단이를 해준다."
					+ "</body></html>");
			break;
		case "시츄":
			informationL.setText("<html><body>"
					+ "원산지 : 티베트 <br> 체고 : 22~27cm <br> 체중 : 5.4~6.8Kg <br> 크기 : 소형<br>"
					+ "외모 : 멋지게 늘어진 2중모와 등 위로 곡선을 그리는 꼬리가 특징<br>"
					+ "성격 : 사교적이고 친근하고 영리하며 가끔 고집을 부리기도 함<br>"
					+ "추천성향 : 아파트/단독주택/전원주택, 어린이/젊은층/노년층, 운동량 보통<br>"
					+ "주요유의질병 : 외이염, 신장염<br>"
					+ "색상 : 다양한색상<br>"
					+ "그룹구분 : 토이 (일반적으로 애완견을 의미)<br>"
					+ "친화성 : 높음 <br> 털빠짐 : 보통 <br> 집지키기 : 부적절 <br> 실내외구분 : 실내<br><br>"
					+ "이 견종은 작은 몸이, 기차와 같은 형상으로 부드럽게 움직이는 놀라운 동작으로 유명하다. <br> "
					+ "사자머리 같은 머리에 납작한 코, 먼지떨이 같은 꼬리, 무성 영화를 보는 것 같은 빠르고도 귀여운 몸짓 등이 인상적인 개다.<br>"
					+ "장모종이므로 털을 매일 손질해 주어야 하지만 털길이에 비해 털은 많이 빠지지 않으며<br>"
					+ "체취도 많이 나지 않으므로 가정견으로 이상적이다. <br> "
					+ "감정이 풍부한 편이어서 애교도 많고 아이들과도 잘 어울릴 수 있다. <br>"
					+ "반면에, 자존심이 강한 편이므로 주인이 난폭해지거나 화를 내면 이에 대한 반응이 매우 빠르다."
					+ "</body></html>");
			break;
		case "먼치킨":
			break;
		case "뱅갈":
			break;
		case "브리티시숏헤어":
			break;
		case "아비시니안":
			break;
		case "스핑크스":
			break;
		case "러시안블루":
			break;
		case "페르시안":
			break;
		case "랙돌":
			break;
		case "노르웨이숲":
			break;
		case "샴":
			break;
		case "메인쿤":
			break;
		case "터키시앙고라":
			break;
		}
		add(informationL, BorderLayout.SOUTH);

		setVisible(true);
	}
}
