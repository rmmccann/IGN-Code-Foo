package com.ryan_mccann.connect4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class Column extends Panel implements MouseListener
{
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	boolean hover = false;
	
	public Column()
	{
//		this.setSize(width, height)
//		for(int i=0; i<6 ; i++) pieces.add(new Piece());
		
//		this.setBackground(Color.ORANGE);//debug
		
		this.placePiece();
		this.placePiece();
		this.placePiece();
		this.placePiece();
		if(Math.random()>0.5) this.placePiece();
	}
	
	public void placePiece()
	{
//		if(!canPlaceInColumn()) //TODO throw error
		pieces.add(new Piece("black"));
		//animation
	}
	
	public void paint(Graphics g)
	{
		//g.setColor(Color.BLACK);
		g.setColor(Color.BLUE);
//		g.fillRect(0, 0, getWidth(), getHeight());
//		g.setColor(Color.Y);
		
		//Draw existing pieces:
		for(int i=0; i<pieces.size(); i++)
		{
			Piece p = pieces.get(i);
			g.setColor(p.getColor());
			g.fillOval(0, getPieceY(i), Piece.DIAMETER, Piece.DIAMETER);
		}
		
		//For the highlighting:
		if(hover){
			g.setColor(new Color(255,255,255,128));
		} else {
			g.setColor(new Color(0,0,0,0)); //alpha==0, no effect
		}
		g.fillRect(0, 0, getWidth(), getHeight());
		g.fillOval(0, getNextPieceY(), Piece.DIAMETER, Piece.DIAMETER);
		
		//drawing the inner ring
//		g.setColor(new Color(255,255,255, -128)); //problem: can't have negative alpha
		g.setColor(getBackground());
		g.fillOval(5, getNextPieceY()+5, Piece.DIAMETER-10, Piece.DIAMETER-10);//inner ring
	}
	
	int getPieceY(int index)
	{
		return (6 - index) * Piece.DIAMETER;
		//should be:
		//return index * Piece.DIAMETER;
	}
	
	int getNextPieceY()
	{
		if(!canPlaceInColumn()) return -100;
		
		int val = (6 - pieces.size()) * Piece.DIAMETER;
		return val;
	}
	
	boolean canPlaceInColumn()
	{
		if(pieces.size() >= 6) return false;
		else return true;
	}

	public void mouseClicked(MouseEvent e)
	{
		//TODO if player's turn, add a piece of the proper color
	}
	public void mousePressed(MouseEvent e)
	{
		System.out.println(toString().replaceFirst("com.ryan_mccann.connect4.Column", "").replaceAll(",layout=java.awt.FlowLayout", ""));
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		hover = true;
		//System.out.println("entered");
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		hover = false;
		//System.out.println("exited");
		repaint();
	}
}
