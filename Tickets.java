public class Line {
  
  public static String Tickets(int[] peopleInLine)
  {
        //Your code is here...
        int rest = 0;
        
        for( int i = 0; i < peopleInLine.length; i++){
          if(  peopleInLine[i] == 25){
            rest += peopleInLine[i];
            continue;
          }else if( peopleInLine[i] > 25){
            if( rest >= (peopleInLine[i] - 25)){
              rest -= (peopleInLine[i] - 25);
              continue;
            }else{
              return "NO";
            }
          }else{
            return "NO";
          }
        }
        
        return "YES";
  }
}
