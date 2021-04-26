package uimanager.uimanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class UiManager extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Dungeons ui is loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
