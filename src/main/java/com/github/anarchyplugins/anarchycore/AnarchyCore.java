package com.github.anarchyplugins.anarchycore;

import com.github.anarchyplugins.anarchycore.utils.ItemUtil;
import com.github.anarchyplugins.anarchycore.utils.Util;
import com.github.anarchyplugins.anarchycore.commands.*;
import com.github.anarchyplugins.anarchycore.listeners.*;
import com.google.gson.Gson;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class AnarchyCore extends JavaPlugin {

    private final PluginManager pluginManager = getServer().getPluginManager();
    public static File dataFolder;
    public static Gson gson = new Gson();
    public static AnarchyCore INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        saveDefaultConfig();
        dataFolder = this.getDataFolder();

        Util.setPrefix(getConfig().getString("prefix"));

        pluginManager.registerEvents(new RedstoneEvents(),this);
        pluginManager.registerEvents(new ElytraEvents(), this);
        pluginManager.registerEvents(new MoveEvents(), this);
        pluginManager.registerEvents(new ServerEvents(), this);
        pluginManager.registerEvents(new ConnectionEvents(this), this);

        getCommand("toggleconnectionmsgs").setExecutor(new ToggleConnectionMsgsCmd(this));
        getCommand("kill").setExecutor(new KillCmd(this));
        getCommand("discord").setExecutor(new DiscordCmd(this));
        getCommand("gmc").setExecutor(new GmcCmd(this));
        getCommand("gms").setExecutor(new GmsCmd(this));
        getCommand("gmsp").setExecutor(new GmspCmd(this));
        getCommand("help").setExecutor(new HelpCmd(this));
        getCommand("anarchycore").setExecutor(new CoreCmd(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public ItemUtil getItemUtils(){
        return new ItemUtil(this);
    }

}
