package patten4;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;

	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void setMode(Mode mode) {// ���� ��� �Ǵ� �˶� ��带 ������.
		this.theMode = mode;
	}
	public void pressed() {//������ ��忡 ���� ������ �Ѱų� �˶��� �︲
		switch(theMode) {
		case LAMP://���� ���� ������ ��
			theLamp.turnOn();
			break;
		case ALARM://�˶� ���� �˶��� �︮�� ��
			theAlarm.start();
			break;
		}
	}
}
