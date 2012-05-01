package com.ryan_mccann.connect4;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Connect4Frame extends Frame
{
	public static void main(String[] args)
	{
		int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
		int x = (screenW - Connect4.WIDTH)/2;
		int y = (screenH - Connect4.HEIGHT)/2;
		
		Connect4Frame frame = new Connect4Frame();
		frame.setBounds(x, y, Connect4.WIDTH, Connect4.HEIGHT);
//		frame.setIconImage(image);//TODO
		
		frame.add(new Connect4());
		
		frame.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			});
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
