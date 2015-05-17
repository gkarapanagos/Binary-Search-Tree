
class Swimming extends AbstractIRanked{

	Swimming(String name, int ranking){
		super(name,ranking);
	}
	
	// Returns the name of the Swimmer
	public String returnName() {
		return this.name;
	}
	
	// Checks whether the given Swimmer has a better ranking
	public boolean hasBetterRanking(IContestant contestant2) {
		if((this.ranking < contestant2.returnRanking()) && (this.ranking > 0))
			return true;
		else if (this.ranking <= 0)
			throw new RuntimeException ("Ranking must be larger than 0");
		else
			return false;
	}
	
	// Returns the ranking of the Swimmer
	public int returnRanking() {
		return this.ranking;
	}
}
