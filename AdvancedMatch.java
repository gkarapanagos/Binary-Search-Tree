
public class AdvancedMatch implements ITournament{
 MatchData data;
 ITournament feeder1;
 ITournament feeder2;
 

 AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2){
  this.data = data;
  this.feeder1 = feeder1;
  this.feeder2 = feeder2;
 }

//This method checks that each side of a tournament has the same number of branches in the same configuration.
 public boolean isBalanced() {
  if((feeder1.count() == feeder2.count())
  && feeder1.isBalanced()
  && feeder2.isBalanced())
   return true;
  else
   return false;
 }

//Counts the number of branches within one parent.
 public int count() {
  return 1 + feeder1.count() + feeder2.count();
 }
 
 
}
