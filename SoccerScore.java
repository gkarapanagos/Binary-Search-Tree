	
public class SoccerScore implements IScore {
	int goals1;
	int goals2;
	boolean usedExtraTime;
	
	SoccerScore (int goals1, int goals2, boolean usedExtraTime){
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.usedExtraTime = usedExtraTime;
	}
	
	// Returns whether the winner is the first or the second contestant, according to the score
	public int winCheck() {
		if (this.goals1 >= this.goals2)
			return 1;
		else
			return 2;
	}

	// Returns the name of the contestant who won the match
	public String winner(IContestant contestant1, IContestant contestant2) {
		if(this.winCheck() ==1)
		return contestant1.returnName();
		else
		return contestant2.returnName();
	}
}
