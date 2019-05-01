package Patten5;

import java.util.List;

public class MinMaxView implements Observer{
	private ScoreRecord record;

	public MinMaxView(ScoreRecord record) {
		this.record = record;
	}

	@Override
	public void update() {
		List<Integer> records = record.getScoreRecord();
		displayMinMax(records);
	}
	
	public void displayMinMax(List<Integer> record) {
		int min = record.stream().min(Integer::compare).orElse(null);
		int max = record.stream().max(Integer::compare).orElse(null);
		System.out.println("min: "+min+" max: "+max);
	}
	
	
}
