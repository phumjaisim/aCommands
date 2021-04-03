package com.ionly.acommands;

import com.ionly.acommands.sql.MySQL;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLException;

public final class aCommands extends JavaPlugin {

    public MySQL SQL;

    @Override
    public void onEnable() {
        System.out.println("aCommand V2.0 by iOnly");
        System.out.println("aCommands has been operated");
        System.out.println("Beginning connect to Dashboard Database");
        this.SQL = new MySQL();

        try {
            SQL.connect();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            Bukkit.getLogger().info("Database is not connected");
            System.out.println("Database is not connected!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (SQL.isConnected()) {
            Bukkit.getLogger().info("Database is connected");
            System.out.println("Database is connected!");
        }

    }

    @Override
    public void onDisable() {
        SQL.disconnect();
    }
}
