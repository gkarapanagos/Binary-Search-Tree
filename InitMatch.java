
public class InitMatch implements ITournament{
 MatchData data;

 InitMatch(MatchData data){
  this.data = data;
 }

 //Returns true when an InitMatch is checked for being balanced since both branches are empty.
 public boolean isBalanced() {
  return true;
 }

//Adds 1 (counting itself) to the count of the number of branches within it since both branches are empty.
 public int count() {
 return 1;
 }
 

}
