package patten4;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		setCommand(theCommand);
	}
	//��ư�� ������ �־��� Command�� execute �޼��带 ȣ��
	public void pressed() { theCommand.execute(); }
	
	public void setCommand(Command newCommand) {
		this.theCommand=newCommand;
	}
}
