package com.cheetahlabs.minequest.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.cheetahlabs.minequest.Minequest;

public class ServerChatPlayerListener implements Listener {
	public static Minequest plugin;
	
	public ServerChatPlayerListener(Minequest instance) {
		plugin = instance;
	}
	
	public void onPlayerChat(PlayerChatEvent chat) {
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		
		//Command Listeners

	}
}
