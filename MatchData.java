
public class MatchData {
 IContestant contestant1;
 IContestant contestant2;
 IScore score;
 Venue matchVenue;
 // checks whether the given score is valid

 MatchData(IContestant contestant1, IContestant contestant2, IScore score, Venue matchVenue){
  this.contestant1 = contestant1;
  this.contestant2 = contestant2;
  this.score = score;
  this.matchVenue = matchVenue;
 }
 
  //Returns a string of the name of the winner of a match of type MatchData.
 String winner() {
  if (this.score.winCheck() == 1)
   return this.contestant1.returnName();
  else
   return this.contestant2.returnName();
 }
}
