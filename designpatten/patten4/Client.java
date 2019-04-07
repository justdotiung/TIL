package patten4;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();
		Button button = new Button(lamp,alarm);
		button.setMode(Mode.LAMP);
		button.pressed();//램프 모드를 설정했으므로 램프가 켜짐
		
		button.setMode(Mode.ALARM);
		button.pressed();
	}
}
