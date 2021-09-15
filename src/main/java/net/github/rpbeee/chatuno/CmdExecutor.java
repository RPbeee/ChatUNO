package net.github.rpbeee.chatuno;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("chatuno")){
            //
        } else if (cmd.getName().equalsIgnoreCase("unoplay")) {
            //
        }
        return true;
    }
}
