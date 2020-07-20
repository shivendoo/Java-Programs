package CollectionUtilityPrograms;

import java.util.Comparator;

//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
	     if(a.getPlayerScore() == b.getPlayerScore()) {
	    	 return a.getPlayerName().compareTo(b.getPlayerName());
	     }
	     return b.getPlayerScore() - a.getPlayerScore();		
		
	}
	
}
