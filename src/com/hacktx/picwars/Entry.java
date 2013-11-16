/*
 * PicWars Entry Class
 * Includes:
 * 		Game?
 * 		Picture
 * 		Score
 * 		User
 */
@ParseClassName("Entry")
import java.util.*;


public class Entry extends ParseObject{
	private double score;
	private ParseUser user;
	private ArrayList<Integer> scoreList;
	
	public Entry(ParseUser userNew) {
		score=0;
		scoreList= new ArrayList<Integer>();
		user= userNew;
	}
	
	public void addScore(int num) {
		scoreList.add(num);
	}
	
	public double getScore(){
		setScore();
		return score;
	}
	
	private double averageScore() {
		double avg;
		for(Integer n: scoreList) {
			avg+=n;
		}
		return avg/scoreList.size();
	}
	
	public ParseUser getUser() {
		return user;
	}
	
	public void setScore() {
		score= averageScore();
	}
	
	
}