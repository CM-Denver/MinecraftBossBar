package com.william.plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	//Create variable outside onEnable(). We can access this variable if we have access to the Main class:
	BossBar bossbar;
	
	@Override
	public void onEnable() {
		System.out.println("BossBar plugin has worked (sorta)");
		
		//Add JoinListener:
		Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
		
		//Creates a solid red bar with yellow text:
		bossbar = Bukkit.createBossBar(ChatColor.YELLOW + "Welcome to the server!", BarColor.RED, BarStyle.SOLID);
	}
	
	@Override
	public void onDisable() {
		System.out.println("BossBar plugin disabled");
	}
	
}
