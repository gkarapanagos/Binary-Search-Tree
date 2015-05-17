
public class BaseballScore implements IScore {
 int runs1;
 int runs2;
 int innings;
 boolean rainShortened;
 
 BaseballScore(int runs1, int runs2, int innings, boolean rainShortened){
  this.runs1 = runs1;
  this.runs2 = runs2;
  this.innings = innings;
  this.rainShortened = rainShortened;
 }
 
 //Checks which team has more runs in a game and produces a corresponding integer for that team.
 public int winCheck() {
  if (this.runs1 >= this.runs2)
   return 1;
  else
   return 2;
 }
 
 //Returns a string of the name of the winner of a game of baseball when given a score with two teams as paramenters.
 public String winner(IContestant contestant1, IContestant contestant2) {
  if(this.winCheck() ==1)
  return contestant1.returnName();
  else
  return contestant2.returnName();
 }
}
