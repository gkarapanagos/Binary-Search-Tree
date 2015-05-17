
class Soccer extends AbstractITeam implements IRanked{
	int ranking;

	Soccer(String teamName, int numPlayers, String captain, int ranking){
		super(teamName, numPlayers, captain);
		this.ranking= ranking;
	}

	// Returns the name of the Soccer team
	public String returnName() {
		return this.teamName;
	}

	// Returns whether the given Soccer team has a better ranking
	public boolean hasBetterRanking(IContestant contestant2) {
		if((this.ranking < contestant2.returnRanking()) && (this.ranking > 0))
			return true;
		else if (this.ranking <= 0)
			throw new RuntimeException ("Ranking must be larger than 0");
		else
			return false;
	}

	// Returns the ranking of the Soccer team
	public int returnRanking() {
		return this.ranking;
	}
}
