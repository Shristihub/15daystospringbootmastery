package com.example.auto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {

	@Autowired
	@Qualifier("guitar")
	private IInstrument instrument;
	@Autowired
	private IInstrument violin;
	
	private IInstrument inst;

	public Performer(@Qualifier("keyboard")IInstrument inst) {
		super();
		this.inst = inst;
	}
	
	public void bandMusic(String song, String type) {
		if(type.equals("g"))
			instrument.playSong(song);
		if(type.equals("v"))
			violin.playSong(song);
		if(type.equals("k"))
			inst.playSong(song);
		
		
	}
	
	
}
