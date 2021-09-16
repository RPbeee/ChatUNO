package net.github.rpbeee.chatuno;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatUNO extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ChatUNOが開始しました");
        Bukkit.getPluginCommand("chatuno").setExecutor(new CmdExecutor());
        Bukkit.getPluginCommand("unoplay").setExecutor(new CmdExecutor());
        Bukkit.getPluginCommand("unoadmin").setExecutor(new CmdExecutor());
    }

    @Override
    public void onDisable() {
        getLogger().info("ChatUNOが終了しました");
    }
}
