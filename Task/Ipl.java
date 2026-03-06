class Ipl {

    String sponsor;
    int teams;
    double prizeMoney;
    boolean internationalPlayers;
    String season;

    Team team;
    Player player;
    Stadium stadium;
    Umpire umpire;
    Trophy trophy;

    Ipl(String sponsor, int teams, double prizeMoney, boolean internationalPlayers, String season,
        Team team, Player player, Stadium stadium, Umpire umpire, Trophy trophy) {

        this.sponsor = sponsor;
        this.teams = teams;
        this.prizeMoney = prizeMoney;
        this.internationalPlayers = internationalPlayers;
        this.season = season;

        this.team = team;
        this.player = player;
        this.stadium = stadium;
        this.umpire = umpire;
        this.trophy = trophy;
    }

    void getInfo() {

        System.out.println("Sponsor: " + this.sponsor);
        System.out.println("Teams: " + this.teams);
        System.out.println("Prize Money: " + this.prizeMoney);
        System.out.println("International Players: " + this.internationalPlayers);
        System.out.println("Season: " + this.season);

        if(team != null){
            team.getInfo();
        }

        if(player != null){
            player.getInfo();
        }

        if(stadium != null){
            stadium.getInfo();
        }

        if(umpire != null){
            umpire.getInfo();
        }

        if(trophy != null){
            trophy.getInfo();
        }
    }
}