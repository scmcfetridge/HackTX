/*
 * PicWars Entry Class
 * Includes:
 * 		Game?
 * 		Picture
 * 		Score
 * 		User
 */

import java.util.*;

public class Entry {
	private double score;
	private User user;
	private ArrayList<Integer> scoreList;
	
	public Entry(User userNew) {
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
	
	public User getUser() {
		return user;
	}
	
	public void setScore() {
		score= averageScore();
	}
	
	
}
