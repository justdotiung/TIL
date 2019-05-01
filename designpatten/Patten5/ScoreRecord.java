package Patten5;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	List<Integer> scores = new ArrayList<>();
	
	public void addScore(int score) {
		scores.add(score);
		notifyObservers();
	}
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
