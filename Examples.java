// CS2102 - Homework 4
// Gregory Port
// Georgios Karapanagos


import tester.Tester;


public class Examples {
 // Venues
 Venue v1 = new Venue ("Stadium", 25000);
 Venue v2 = new Venue ("Pitch", 30000);
 // Baseball Scores
 BaseballScore b1 = new BaseballScore (4,6,10,false);
 BaseballScore b2 = new BaseballScore (2,3,6,true);
 BaseballScore b3 = new BaseballScore (3,7,11,false);
 // Soccer Scores
 SoccerScore s1 = new SoccerScore (1,2,false);
 SoccerScore s2 = new SoccerScore (0,0,true);
 SoccerScore s3 = new SoccerScore (2,2,false); 
 // Swimming Scores
 SwimmingScore sw1 = new SwimmingScore (7.5 , 9.8);
 SwimmingScore sw2 = new SwimmingScore (15.7 , 19.8);
 SwimmingScore sw3 = new SwimmingScore (6.0 , 10.8); 
 
 // Contestants
 Baseball bcontestant1 = new Baseball ("Yankees", 16, "Jeter");
 Baseball bcontestant2 = new Baseball ("Red Sox", 17, "Pedrioa");
 Baseball bcontestant3 = new Baseball ("Mets", 14, "Piazza");
 Baseball bcontestant4 = new Baseball ("Giants", 17, "Person");
 
 Soccer scontestant1 = new Soccer ("United", 16, "Rooney", 4);
 Soccer scontestant2 = new Soccer ("Juventus", 17, "Pirlo", 3);
 Soccer scontestant3 = new Soccer ("Real", 18, "Ronaldo", 2);
 Soccer scontestant4 = new Soccer ("Barca", 15, "Messi", 1);
 
 Swimming swcontestant1 = new Swimming("Phelps", 1);
 Swimming swcontestant2 = new Swimming("Jack", 2);
 Swimming swcontestant3 = new Swimming("John", 3);
 Swimming swcontestant4 = new Swimming("Zack", 4);
 
 
 // Initial Matches' Data
 MatchData d1 = new MatchData (scontestant1, scontestant2, s1, v1);
 MatchData d2 = new MatchData (scontestant3, scontestant4, s2, v2);
 MatchData d3 = new MatchData (bcontestant1, bcontestant2, b1, v1);
 MatchData d4 = new MatchData (bcontestant3, bcontestant4, b2, v2);
 MatchData d5 = new MatchData (swcontestant1, swcontestant2, sw1, v1);
 MatchData d6 = new MatchData (swcontestant3, swcontestant4, sw2, v2);
 
 // Advanced Matches' Data
 MatchData d7 = new MatchData (scontestant2, scontestant3, s3, v2);
 MatchData d8 = new MatchData (bcontestant2, bcontestant4, b3, v1);
 MatchData d9 = new MatchData (swcontestant1, swcontestant3, sw3, v1); 
  
 // Initial Matches
 InitMatch I1 = new InitMatch (d1); // first soccer game
 InitMatch I2 = new InitMatch (d2); // second soccer game
 InitMatch I3 = new InitMatch (d3); // first bball game
 InitMatch I4 = new InitMatch (d4); // second bball game
 InitMatch I5 = new InitMatch (d5); // first swimming game
 InitMatch I6 = new InitMatch (d6); // second swimming game
 
 // Respective Advanced Matches following the initial above
 AdvancedMatch A1 = new AdvancedMatch(d7, I1, I2);
 AdvancedMatch A2 = new AdvancedMatch(d8, I3, I4);
 AdvancedMatch A3 = new AdvancedMatch(d9, I5, I6);
 AdvancedMatch A4 = new AdvancedMatch(d9, I5, A3); //Right side has more branches than left.
 
 //The following 3 take in a score and produce a string of the name of the winner of that game.
  boolean test1(Tester t) {
       return t.checkExpect(b1.winner(bcontestant1, bcontestant2), "Red Sox"); } 
  //Checks that the first contestant is produced if the first score is better.
  boolean test2(Tester t) {
       return t.checkExpect(s2.winner(scontestant3, scontestant4), "Real"); } 
  //Checks that the first contestant is produced if the scores are tied.
  boolean test3(Tester t) {
       return t.checkExpect(sw2.winner(swcontestant3, swcontestant4), "John"); } 
  //Checks that the second contestant is produced if the second score is better (lower in this case since it is swimming).
  
  //The following 3 take in a MatchData and produce a string of the name of the winner of that match.
  boolean test4(Tester t) {
       return t.checkExpect(d2.winner(), "Real"); }
  //Checks that the second contestant is produced if the second score is better (lower in this case since it is swimming).
  boolean test5(Tester t) {
       return t.checkExpect(d3.winner(), "Red Sox"); }
  //Checks that the first contestant is produced if the first score is better.
  boolean test6(Tester t) {
       return t.checkExpect(d9.winner(), "Phelps"); }
    //Checks that the first contestant is produced if the first score is better (lower in this case since it is swimming).
  
  boolean test7(Tester t) {
       return t.checkExpect(scontestant1.hasBetterRanking(scontestant2), false); }
  //Checks to see if false is produced for a case of the second contestant having a better ranking.
  boolean test8(Tester t) {
       return t.checkExpect(scontestant3.hasBetterRanking(scontestant4), false); }
  //Checks to see if false is produced for a case of the second contestant having a better ranking.
  boolean test9(Tester t) {
       return t.checkExpect(swcontestant1.hasBetterRanking(scontestant2), true); }
  //Checks to see if true is produced for a case of the first contestant having a better ranking.
  boolean test10(Tester t) {
       return t.checkExpect(swcontestant4.hasBetterRanking(scontestant3), false); }
  //Checks to see if false is produced for a case of the second contestant having a better ranking.
  
  boolean test11(Tester t) {
       return t.checkExpect(A1.isBalanced(), true); }
  //Checks to see if true is produced for a soccer tournament that is balanced on both sides.
  boolean test12(Tester t) {
       return t.checkExpect(A2.isBalanced(), true); }
  //Checks to see if true is produced for a baseball tournament that is balanced on both sides.
  boolean test13(Tester t) {
       return t.checkExpect(A3.isBalanced(), true); }
  //Checks to see if true is produced for a swimming tournament that is balanced on both sides.
  boolean test14(Tester t) {
       return t.checkExpect(A4.isBalanced(), false); }
  //Checks to see if false is produced for a tournament that is not balanced on both sides.
  
  
  
}
