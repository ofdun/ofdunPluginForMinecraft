package ofdun.minecraft.plugin;

import org.bukkit.plugin.java.*;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("OFDUN-PLUGIN STARTED WORKING!");

        this.getCommand("bebra").setExecutor(new AppCommandExecutor());
        this.getCommand("squirt").setExecutor(new AppCommandExecutor());
    }

    @Override
    public void onDisable() {
        getLogger().info("OFDUN-PLUGIN'S DONE!");
    }
}