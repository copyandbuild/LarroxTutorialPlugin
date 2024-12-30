package dev.larrox.larroxTestPlugin;

import dev.larrox.larroxTestPlugin.cmd.Larrox;
import dev.larrox.larroxTestPlugin.events.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LarroxTestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("larrox").setExecutor(new Larrox());

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    }
}
