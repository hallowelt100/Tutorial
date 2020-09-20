package de.hw100.tutorial;

import de.hw100.tutorial.commands.DateCommand;
import de.hw100.tutorial.listeners.JoinListener;
import de.hw100.tutorial.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().fine("Plugin wird aktiviert");

       listenerRegistration();
       commandRegistration();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().fine("Plugin wird deaktiviert");

    }

    public static String getPrefix() {
        return ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Tutorial" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY;
    }

    private void listenerRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);

    }

    private void commandRegistration() {
        getCommand("date").setExecutor(new DateCommand());
    }
}
