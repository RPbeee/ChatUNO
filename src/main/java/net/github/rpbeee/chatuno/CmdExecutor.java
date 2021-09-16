package net.github.rpbeee.chatuno;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdExecutor implements CommandExecutor {

    String premsg = ChatColor.LIGHT_PURPLE+"[ChatUNO] "+ChatColor.WHITE;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("chatuno")){
            sender.sendMessage(premsg+"\n[2] [/] [0] [+]");
        } else if (cmd.getName().equalsIgnoreCase("unoplay")) {
            //
        } else if (cmd.getName().equalsIgnoreCase("unoadmin")) {
            //
        }
        return true;
    }
}
