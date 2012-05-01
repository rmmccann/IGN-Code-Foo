package com.ryan_mccann.connect4;

import java.applet.Applet;

public class Connect4Applet extends Applet
{
	public void init()
	{
		this.setSize(Connect4.WIDTH, Connect4.HEIGHT);
		add(new Connect4());
	}
}
