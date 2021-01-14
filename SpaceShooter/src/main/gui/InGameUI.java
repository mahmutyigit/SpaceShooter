package main.gui;

import main.SpaceShooter;
import processing.core.PApplet;
import processing.core.PConstants;

public class InGameUI extends UI {
	
	public InGameUI(PApplet parent){
		super(parent);
	}

	@Override
	public void render() {
		parent.push();
		
		parent.fill(255);
		parent.textSize(32);
		parent.textAlign(PConstants.LEFT, PConstants.TOP);
		parent.text("Healt: "+ SpaceShooter.player.health,0,0);
		parent.text("level: "+ SpaceShooter.player.level,0,32);
		
		
		parent.pop();
	}
	
}
