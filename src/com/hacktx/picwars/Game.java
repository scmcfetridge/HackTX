package com.example.picwars;
import java.util.*;

public class Game {
	String title;
	ArrayList<Entry> allGames;
	
	public Game(String title) {
			this.title = title;
			allGames = new ArrayList<Entry>();
	}
	
	public void addGame(Game game){
		allGames.add(game);
	}
}
