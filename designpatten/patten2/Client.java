package patten2;

public class Client {
	public static void main(String[] args) {
		Robot teakwonV = new TaekwonV("teakwonV");
		Robot atom = new Atom("atom");
		teakwonV.setAttackStrategy(new MissileStrategy());
		teakwonV.setMovingStrategy(new WalkingStrategy());
		System.out.println("taekwon"+teakwonV.getName());
		
		teakwonV.attak();
		teakwonV.move();
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		System.out.println("atom"+atom.getName());
		
		atom.attak();
		atom.move();
		
		
	}
}
