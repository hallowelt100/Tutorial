package de.hw100.tutorial.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();

        if (player.isOp()) {
            event.setFormat(ChatColor.DARK_RED + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.YELLOW + "%2$s");
        } else if (player.isFlying()){
            event.setFormat(ChatColor.LIGHT_PURPLE + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        } else if (player.getWorld().getName().equalsIgnoreCase("world_nether")){
            event.setFormat(ChatColor.RED + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        } else if (player.getWorld().getName().equalsIgnoreCase("world_the_end")){
            event.setFormat(ChatColor.DARK_PURPLE + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        } else {
            event.setFormat(ChatColor.YELLOW + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.WHITE + "%2$s");
        }

        event.setMessage((player.isOp() ? ChatColor.translateAlternateColorCodes('&', event.getMessage()) : event.getMessage()));

        event.getFormat();
        event.getMessage();
        event.getRecipients();
    }

}
