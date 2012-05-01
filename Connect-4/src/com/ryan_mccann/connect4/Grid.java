package com.ryan_mccann.connect4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Grid extends Panel implements MouseMotionListener
{
	static Rectangle r1 = new Rectangle();
	public Grid()
	{
		setBackground(new Color(224,236,15));
		
		setLayout(new GridLayout(1,7));
		
		for(int i=0; i<7; i++) {
			Column col = new Column();
			col.addMouseListener(col);
			add(col);
		}
		
	}
	
	public void paint(Graphics g)
	{
		for(int x=0; x<630; x+=90)
			for(int y=0; y<540; y+=90)
				g.fillOval(x, y, 90, 90);
	}

	
	public void mouseDragged(MouseEvent e)
	{
		
	}

	public void mouseMoved(MouseEvent e)
	{
		
	}
}

