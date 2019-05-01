package Patten5;

public class Client {
	public static void main(String[] args) {
		ScoreRecord record =new ScoreRecord();
		DataSheetView dataSheetView3= new DataSheetView(record, 3);
		DataSheetView dataSheetView5= new DataSheetView(record, 5);
		MinMaxView minMaxView = new MinMaxView(record);
		
		record.addDataSheetView(dataSheetView3);
		record.addDataSheetView(dataSheetView5);
		record.setMinMaxView(minMaxView);
		
		for (int i = 1; i <= 5; i++) {
			int sco = i * 10;
			System.out.println("adding "+sco);			
			record.addScore(sco);
		}
//		System.out.println(record.getScoreRecord().get(4));
	}
}
