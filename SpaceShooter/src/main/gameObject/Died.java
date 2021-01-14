package main.gameObject;


import main.utils.BoxCollider;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Died extends GameObject {
	


	public Died(PApplet parent, String tag, PImage img, float x, float y) {
		super(parent,  tag, new PVector(x, y), img,1);
		collider =new BoxCollider(parent, pos, new PVector(img.width, img.height) );
	}
	

}