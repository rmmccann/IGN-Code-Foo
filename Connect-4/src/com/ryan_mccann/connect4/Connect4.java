package com.ryan_mccann.connect4;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseMotionListener;

public class Connect4 extends Panel
{
	public static int WIDTH = 720;
	public static int HEIGHT = 720;
	
	AI_Bot bot;
	
	public Connect4()
	{
		setSize(WIDTH, HEIGHT);
//		add(new java.awt.Button("HI"));
		setLayout(new BorderLayout());
		
		Panel grid = new Grid();
		Panel menu = new Panel();
		
		menu.setSize(getWidth(), 200);
		menu.add(new Button("Test"));
		//grid.addMouseMotionListener((MouseMotionListener) grid);
		
		add(grid, BorderLayout.CENTER);
		add(menu, BorderLayout.SOUTH);
//		menu.add(new java.awt.Button("HI"));
		
//		bot = new AI_Bot((Grid) grid);
	}
}
