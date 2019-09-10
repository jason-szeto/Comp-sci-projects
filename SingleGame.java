
public class SingleGame {
	
	private int year;
	private int week;
	private int day;
	private int hTeam;
	private int hScore;
	private int aTeam;
	private int aScore;
	private String date;
	private int hYards;
	private int aYards;
	private int hTurn;
	private int aTurn;
	
	public SingleGame(int aYear, int aWeek, int aDay, int a_hTeam, int a_hScore, int a_aTeam, int a_aScore, String aDate, int a_hYards, 
			int a_aYards, int a_hTurn, int a_aTurn) {
		aYear = year;
		aWeek = week;
		aDay = day;
		a_hTeam = hTeam;
		a_hScore = hScore;
		a_aTeam = aTeam;
		a_aScore = aScore;
		aDate = date;
		a_hYards = hYards;
		a_aYards = aYards;
		a_hTurn = hTurn;
		a_aTurn = aTurn;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int getWeek() {
		return week;
	}
	
	public int getDay() {
		return day;
	}
}
