package DogCat;

public class ButtonIf {
	private String[] buttonIf;  //��ư�� ��� �� ����
	
	public ButtonIf(String[] buttonIf){
		this.buttonIf = buttonIf;
	}

	public String[] getButtonIf() {
		return buttonIf;
	}

	public void setButtonIf(String[] buttonIf) {
		this.buttonIf = buttonIf;
	}
	// buttonIf �迭 ���� ����
	public int length() {
		return buttonIf.length;
	}
}
