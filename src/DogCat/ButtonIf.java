package DogCat;

public class ButtonIf {
	private String[] buttonIf;  //버튼에 출력 될 정보
	
	public ButtonIf(String[] buttonIf){
		this.buttonIf = buttonIf;
	}

	public String[] getButtonIf() {
		return buttonIf;
	}

	public void setButtonIf(String[] buttonIf) {
		this.buttonIf = buttonIf;
	}
	// buttonIf 배열 길이 리턴
	public int length() {
		return buttonIf.length;
	}
}
