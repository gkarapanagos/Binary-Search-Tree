
	public class SwimmingScore implements IScore{
		double timeContestant1;
		double timeContestant2;

	SwimmingScore (double timeContestant1, double timeContestant2){
		this.timeContestant1 = timeContestant1;
		this.timeContestant2 = timeContestant2;
	}

	// Returns whether the first or the second contestant won the match
	public int winCheck() {
		if (this.timeContestant1 <= this.timeContestant2)
			return 1;
		else
			return 2;
		}

	// Returns the name of the Swimmer who won the race
	public String winner(IContestant contestant1, IContestant contestant2) {
		if(this.winCheck() ==1)
			return contestant1.returnName();
		else
			return contestant2.returnName();
	}
	}
