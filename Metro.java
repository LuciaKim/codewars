import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
  //Code here!
  int restPeople = 0;
  
  for( int i = 0; i < stops.size(); i++){
    int[] stop = stops.get(i);
    restPeople += stop[0] - stop[1];
  }
  return restPeople;
  }
}
