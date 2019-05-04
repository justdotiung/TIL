package Patten5;

import java.util.List;

public class StatisticView implements Observer {
	private ScoreRecord score;
	
	public StatisticView(ScoreRecord score) {
		this.score = score;
	}

	@Override
	public void update() {
		List<Integer> list = score.getScoreRecord();
		displayStatistic(list);
	}

	private void displayStatistic(List<Integer> list) {
		list.stream().mapToInt(i->i).average().ifPresent(avg -> System.out.println("Average found is " + avg));
	}

}
