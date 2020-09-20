package de.hw100.tutorial.listeners;

import de.hw100.tutorial.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(Main.getPrefix() + ChatColor.GOLD + "Herzlich Willkommen auf dem Test Server!");
        event.setJoinMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.WHITE + " hat den Server betreten!");
    }
}
