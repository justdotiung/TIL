package Patten5;

public class Client {
	public static void main(String[] args) {
		ScoreRecord record = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(record, 3);
		record.attach(dataSheetView3);
		MinMaxView minMaxView = new MinMaxView(record);
		record.attach(minMaxView);

		for (int i = 1; i <= 5; i++) {
			int sco = i * 10;
			System.out.println("adding " + sco);
			record.addScore(sco);
		}
		record.detach(dataSheetView3);
		StatisticView statisticView = new StatisticView(record);
		record.attach(statisticView);

		for (int i = 1; i <= 5; i++) {
			int sco = i * 10;
			System.out.println("adding " + sco);
			record.addScore(sco);

		}
	}
}
