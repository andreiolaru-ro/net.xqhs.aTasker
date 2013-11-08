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
package net.xqhs.atasker.core;

public class Task
{
	/**
	 * Contains information about the intrinsic requirements for the task.
	 * <p>
	 * E.g. time taken to complete it, places where it could be completed, devices needed etc.
	 */
	Context	realizationContext;
	/**
	 * Contains information about the extrinsic requirements for the task.
	 * <p>
	 * E.g. time deadline, etc.
	 */
	Context	requiredContext;
	
	/**
	 * Contains information about the auto-scheduled context for the task, as decided by the scheduler.
	 */
	Context	scheduledContext	= null;
	
	/**
	 * Indicates how pressing it is for the task to be completed, from the point of view of expiring resources (time,
	 * devices, etc).
	 * <p>
	 * Normally it has values between 0 and 1, with 0 for no pressure, and 1 for extremely pressing.
	 * <p>
	 * If the task is overdue (the resources necessary for the task are already no more available) than it should have
	 * values of over 1.
	 * <p>
	 * The pressure should be calculated based on the force on the task.
	 */
	float	pressure;
	
	/**
	 * Indicates how adequate it is for the task to be realized in the current context.
	 * <p>
	 * Has values between 0 and 1, with 0 meaning the task cannot be performed in the current context, and 1 meaning
	 * that all conditions for the realization of the task are fulfilled (the current context fully matches
	 * realizationContext).
	 */
	float	adequacy;
}
