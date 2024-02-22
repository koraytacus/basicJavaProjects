
/* DESCRIPTION:
There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same.
 Your function accepts three arguments:

number of pillars (≥ 1);
distance between pillars (10 - 30 meters);
width of the pillar (10 - 50 centimeters).
Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).*/

public class Kata{
  
  public static int pillars(int numPill, int dist, int width){
    
    if(numPill == 1){
    System.out.println("There is only one pillar");
      return 0;
      }
    
    else{
    int totalDist = (numPill-1)*dist*100 + (numPill-2)*width;
    System.out.println("Distance between first and last pillars is : " + totalDist + "centimeters .");
    
    return totalDist;
    }
    
    
  }
  
}
