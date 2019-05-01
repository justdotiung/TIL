package Patten5;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();

	private List<DataSheetView> dataSheetViews = new ArrayList<>();
	private MinMaxView maxView ;
	
	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView);
	}
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.maxView = minMaxView;
	}
	
	public void addScore(int score) {
		scores.add(score);
	 for(DataSheetView dataSheetView:dataSheetViews)
		 dataSheetView.update();
		
		 maxView.update();
	
	}
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
