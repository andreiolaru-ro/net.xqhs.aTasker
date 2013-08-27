/*******************************************************************************
 * Copyright (C) 2013 Andrei Olaru.
 * 
 * This file is part of aTasker.
 * 
 * aTasker is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.
 * 
 * aTasker is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with aTasker.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package testing;

import java.awt.Label;
import java.awt.Point;

import javax.swing.JFrame;

import net.xqhs.graphical.GCanvas;
import net.xqhs.graphical.GConnector;
import net.xqhs.graphical.GContainer;
import net.xqhs.graphical.GElement;
import net.xqhs.util.logging.Unit;

/**
 * Project testing
 * 
 * @author Andrei Olaru
 * 
 */
public class Tester extends Unit
{
	/**
	 * The name of the underlying unit.
	 */
	static String	unitName	= "TT";
	
	/**
	 * Testing caller.
	 */
	protected void init()
	{
		this.setUnitName(unitName);
		lf("starting testing");
		
		libTesting();
		
		lf("exiting");
		doExit();
	}
	
	/**
	 * Tests correct inclusion of external functionality.
	 */
	public void libTesting()
	{
		lf("testing Gel");
		
		JFrame frame = new JFrame(unitName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Label("hello. i am an accessory window."));
		
		GCanvas canvas = new GCanvas();
		frame.add(canvas);
		frame.setLocation(1500, 200);
		frame.setSize(500, 500);
		
		frame.setVisible(true);
		
		GElement el1 = new GElement().setCanvas(canvas).setMoveTo(new Point(10, 0));
		GElement el2 = new GElement().setCanvas(canvas).setMoveTo(new Point(0, 10));
		new GConnector().setFrom(el1).setTo(el2).setCanvas(canvas);
		new GContainer().setSize(100, 100).addReferencingElement(el1).addReferencingElement(el2).setCanvas(canvas);
	}

	/**
	 * @param args
	 *            : command-line arguments
	 */
	public static void main(String[] args)
	{
		new Tester().init();
	}
}
