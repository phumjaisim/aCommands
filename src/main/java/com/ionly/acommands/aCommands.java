package com.ionly.acommands;

import org.bukkit.plugin.java.JavaPlugin;

public final class aCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("aCommands has been operated");
        System.out.println();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
