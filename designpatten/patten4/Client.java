package patten4;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);

		Button button1 = new Button(lampOnCommand); //������ Ŀ�ǵ� ����
		button1.pressed();//��ư ������ ������ ����
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmStartCommand(alarm);
		
		Button button2 = new Button(alarmOnCommand); //�˶� Ŀ�ǵ� ����
		button2.pressed();//�˶�����
		
		button2.setCommand(lampOnCommand);
		button2.pressed(); //������ ��ư ����
	}
}
