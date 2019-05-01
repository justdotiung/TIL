package Patten5;

import java.util.ArrayList;
import java.util.List;

public class DataSheetView implements Observer{
	private ScoreRecord record;
	private int viewCount;
	
	public DataSheetView(ScoreRecord record, int viewCount) {
		this.record = record;
		this.viewCount = viewCount;
	}

	@Override
	public void update() {
		List<Integer> records = record.getScoreRecord();
		displayScores(records, viewCount);
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.print("List of "+viewCount+"entries ");
		for (int i = 0; i < viewCount && i < record.size(); i++) {
			System.out.print(record.get(i)+" ");
		}
		System.out.println();
	}

	
}
