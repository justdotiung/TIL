package Patten5;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private MinMaxView maxView;
	
	public void setMinMaxView(MinMaxView maxView) { 
		this.maxView = maxView;
	}
	
	public void addScore(int score) {
		scores.add(score);
		maxView.update();
	}
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
