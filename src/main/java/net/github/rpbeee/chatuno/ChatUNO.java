package net.github.rpbeee.chatuno;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatUNO extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ChatUNOが開始しました");

    }

    @Override
    public void onDisable() {
        getLogger().info("ChatUNOが終了しました");
    }
}
