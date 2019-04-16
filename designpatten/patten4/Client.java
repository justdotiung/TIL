package patten4;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);

		Button button1 = new Button(lampOnCommand); //램프온 커맨드 설정
		button1.pressed();//버튼 눌리면 램프온 실행
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmStartCommand(alarm);
		
		Button button2 = new Button(alarmOnCommand); //알람 커맨드 설정
		button2.pressed();//알람실행
		
		button2.setCommand(lampOnCommand);
		button2.pressed(); //램프온 버튼 실행
	}
}
