/*
 * MineQuest - Bukkit Plugin for adding RPG characteristics to minecraft
 * Copyright (C) 2011  Jason Monk
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.cheetahlabs.minequest.Event.Absolute;

import org.monksanctum.MineQuest.Event.EventParser;
import org.monksanctum.MineQuest.Event.NormalEvent;

public class EntitySpawnerCompleteEvent extends NormalEvent {
	protected EntitySpawnerEvent[] events;

	public EntitySpawnerCompleteEvent(long delay, EntitySpawnerEvent[] eventss) {
		super(delay);
		this.events = eventss;
	}
	
	@Override
	public void activate(EventParser eventParser) {
		super.activate(eventParser);
		
		for (EntitySpawnerEvent event : events) {
			event.setComplete(true);
		}
	}
	
	@Override
	public String getName() {
		return "Entity Spawner Destruction Event";
	}
}
