
class Baseball extends AbstractITeam {

 Baseball(String teamName, int numPlayers, String captain){
    super(teamName, numPlayers, captain);
 }

//Returns the name of a team.
 public String returnName() {
  return this.teamName;
 }

//Produces an error if the ranking of a baseball team is called since baseball teams do not having rankings.
 public int returnRanking() {
  throw new RuntimeException("Baseball teams don't have a ranking.");
 }
 }
