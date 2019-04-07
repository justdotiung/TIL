package patten4;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();
		Button button = new Button(lamp,alarm);
		button.setMode(Mode.LAMP);
		button.pressed();//���� ��带 ���������Ƿ� ������ ����
		
		button.setMode(Mode.ALARM);
		button.pressed();
	}
}
