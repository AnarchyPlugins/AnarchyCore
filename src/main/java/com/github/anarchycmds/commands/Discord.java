package com.github.anarchycmds.commands;

import com.github.anarchycmds.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Discord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(Main.INSTANCE.getConfig().getBoolean("discord-command")){
            String str = Main.INSTANCE.getConfig().getString("messages.discord-message");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
            return true;
        }
        return false;
    }
}
