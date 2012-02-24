/* MineQuest Reloaded the rpg plugin.
 * This is the new version of the original plugin by Jmonk.
 * 
 * 
 * @Author: Echobob, Jmonk
 * @Authors: Xu_R, Wafflegod
 * 
 */

package com.cheetahlabs.minequest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.cheetahlabs.minequest.listener.ServerChatPlayerListener;

//Vault imports. Used to find and hook into permissions and economy. 
import net.milkbowl.vault.economy.*;
import net.milkbowl.vault.permission.*;

public class Minequest extends JavaPlugin {
	
	private String versionString;
	public double version;
	public String name;
	private static Server server;
	public final Logger mqLogger = Logger.getLogger("Minecraft");
	public final ServerChatPlayerListener playerListener = new ServerChatPlayerListener(this);
//    public static MobHandler mobHandler = new MobHandler();
	public static ConfigHandler configHandler;
//    public static QuesterHandler questerHandler = new QuesterHandler();
//    public static TownHandler townHandler = new TownHandler();
    public static Minequest Minequest; 
    
	public static void log(String string) {
		//log.info("[MineQuest] " + string);
		System.out.println("[MineQuest] " + string);
	}
	
	public double version(){
		PluginDescriptionFile pdfFile = this.getDescription();
        versionString = pdfFile.getVersion();
        version = Double.parseDouble(versionString);
		return version;
	}
	public String getname(){
		PluginDescriptionFile pdfFile = this.getDescription();
		name = pdfFile.getName();
		return name; 
	}
	
	//Starts MineQuest and loads all npcs. 
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		version = version();
		this.mqLogger.info(name + "version" + version + " is Enabled");
		
		
	}
	
	//Disables MQ and removes all npcs and saves them one last time in the sql. 
	@Override
	public void onDisable() {
		this.mqLogger.info(name + " is now disabled.");
		
	}

}
