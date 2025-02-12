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

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.monksanctum.MineQuest.Event.Event;
import org.monksanctum.MineQuest.Event.EventParser;

public class BlockDCEvent extends BlockEvent {
	private long second_delay;
	private Material otherType;
	private boolean first;

	public BlockDCEvent(long delay, long second_delay, Block block, Material newType) {
		super(delay, block, newType);
		this.newType = Material.AIR;
		this.otherType = newType;
		this.second_delay = second_delay;
		first = false;
	}
	
	@Override
	public void activate(EventParser eventParser) {
		if (!first) {
			super.activate(eventParser);
			
			first = true;
			
			eventParser.setComplete(false);
			delay = second_delay;
		} else {
			Event event = new BlockEvent(second_delay, block, otherType);
			
			event.activate(eventParser);
			
			eventParser.setComplete(true);
		}
	}
	
	@Override
	public String getName() {
		return "Block Create-Destroy Event";
	}

}
