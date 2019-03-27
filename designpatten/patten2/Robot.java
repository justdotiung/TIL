package patten2;

public abstract class Robot implements MovingStrategy, AttackStrategy {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void attak() {
		attackStrategy.attak();
	}

	@Override
	public void move() {
		movingStrategy.move();
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
