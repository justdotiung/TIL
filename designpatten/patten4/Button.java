package patten4;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		setCommand(theCommand);
	}
	//버튼이 눌리면 주어진 Command의 execute 메서드를 호출
	public void pressed() { theCommand.execute(); }
	
	public void setCommand(Command newCommand) {
		this.theCommand=newCommand;
	}
}
