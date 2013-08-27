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

import net.xqhs.util.logging.UnitComponent;

/**
 * Project testing
 * 
 * @author Andrei Olaru
 *
 */
public class Tester
{
	
	/**
	 * @param args : command-line arguments
	 */
	public static void main(String[] args)
	{
		UnitComponent log = (UnitComponent) new UnitComponent().setUnitName("TT");
		log.lf("starting");
		log.lf("exiting");
		log.doExit();
	}
	
}
