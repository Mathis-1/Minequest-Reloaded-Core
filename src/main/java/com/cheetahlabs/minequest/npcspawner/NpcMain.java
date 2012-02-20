package com.cheetahlabs.minequest.npcspawner;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.topcat.npclib.NPCManager;

public class NpcMain {
		public static NPCManager npcManager;
//Spawns a human npc with the Name and at the location supplied from the command listener in the given world.
//TODO: Add World to method.
		public static void spawnnpc(String name, Location location){
		double x = location.getX();
		double y = location.getY();
		double z = location.getZ();
		double pitch = location.getPitch();
		double yaw = location.getYaw();
		npcManager.spawnHumanNPC(name, location);	
		
	}
//
}
