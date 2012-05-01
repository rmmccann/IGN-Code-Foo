package com.ryan_mccann.connect4;

import java.awt.Color;

public class Piece
{
	public static int DIAMETER = 100;
	public String color;
	
	public Piece(String color)
	{
		this.color = color;
	}
	
	public Color getColor()
	{
		//TODO bad
		return (color.toLowerCase().equals("red")) ? new Color(255,0,0) : new Color(0,0,0);
	}
}
