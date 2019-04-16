package patten4;

public class LampOffCommand implements Command {
	private Lamp lampOff;
	
	public LampOffCommand(Lamp lampOff) {
		this.lampOff = lampOff;
	}

	@Override
	public void execute() {
		lampOff.turnOff();
	}

}
