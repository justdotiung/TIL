package Patten5;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MinMaxView {
	private ScoreRecord record;
	
	public MinMaxView(ScoreRecord record) {
		this.record=record;
	}

	public void update() {
		List<Integer> re = record.getScoreRecord();
		displayMinMax(re);
	}

	private void displayMinMax(List<Integer> re) {
		int min = re.stream().min(Integer::compare).orElse(null);
		int max = re.stream().max(Integer::compare).orElse(null);
		System.out.println("min : "+min+" Max : "+max);
	}
}
