package me.nonetaken.dvz;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Project: me.nonetaken | Author: NoneTaken#0001
 * Created: 10/09/2023 at 13:08
 */
public class Main extends JavaPlugin {

    @Getter private static Main INSTANCE;

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        INSTANCE = null;
    }
}