package Patten5;

public class Client {
	public static void main(String[] args) {
		ScoreRecord record =new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(record, 3);
		
		record.SetDataSheetView(dataSheetView);
		
		for (int i = 0; i < 5; i++) {
			int sco = i * 10;
			System.out.println("adding"+sco);			
			record.addScore(sco);
		}
	}
}
