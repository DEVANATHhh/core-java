class Cricket
{
    String format;
    String team1;
    String team2;
    String captain1;
    String captain2;
    String venue;
    String umpire;
    int overs;
    int wickets;
    int runs;
    int extras;
    int target;
    int powerplayOvers;
    int totalMatches;
    String manOfTheMatch;
    String tossWinner;
    String matchDate;
    String seriesName;
    boolean isDayNight;
    String result;
	
	Cricket(String format,String team1,String team2,String captain1,String captain2,String venue,
	String umpire,int overs,int wickets,int runs,int extras,int target,int powerplayOvers,int totalMatches,
	String manOfTheMatch,String tossWinner,String matchDate,String seriesName,boolean isDayNight,
	String result)
	{
		this.format=format;
		this.team1=team1;
		this.team2=team2;
		this.captain1=captain1;
		this.captain2=captain2;
		this.venue=venue;
		this.umpire=umpire;
		this.overs=overs;
		this.wickets=wickets;
		this.runs=runs;
		this.extras=extras;
		this.target=target;
		this.powerplayOvers=powerplayOvers;
		this.totalMatches=totalMatches;
		this.manOfTheMatch=manOfTheMatch;
		this.tossWinner=tossWinner;
		this.matchDate=matchDate;
		this.seriesName=seriesName;
		this.isDayNight=isDayNight;
		this.result=result;
	}
}