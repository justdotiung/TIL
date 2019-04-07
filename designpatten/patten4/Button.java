package patten4;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;

	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void setMode(Mode mode) {// 램프 모드 또는 알람 모드를 설정함.
		this.theMode = mode;
	}
	public void pressed() {//설정된 모드에 따라 램프를 켜거나 알람을 울림
		switch(theMode) {
		case LAMP://램프 모드면 램프를 켬
			theLamp.turnOn();
			break;
		case ALARM://알람 모드면 알람을 울리게 함
			theAlarm.start();
			break;
		}
	}
}
