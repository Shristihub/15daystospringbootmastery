package com.example.auto5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamesArena {

	private IGames igame;
	private IGames ogame;
	private IGames wgame;
	public GamesArena(@Qualifier("indoor") IGames igame,
			@Qualifier("outdoor") IGames ogame,
			@Qualifier("web") IGames wgame) {
		super();
		this.igame = igame;
		this.ogame = ogame;
		this.wgame = wgame;
	}
	
	public void showGames() {
		igame.gamesPlayed();
		ogame.gamesPlayed();
		wgame.gamesPlayed();
	}
	
}




