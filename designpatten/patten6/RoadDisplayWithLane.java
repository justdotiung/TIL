package patten6;

public class RoadDisplayWithLane extends RoadDisplay{

	@Override
	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("���� ǥ��");
	}
	
}
