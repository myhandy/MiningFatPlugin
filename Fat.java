package com.myhandy.MiningFat;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public final class Fat extends JavaPlugin {
	public void onEnable(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
	   	  	@Override
	   	  	public void run() {
	   	  		for(Player p : Bukkit.getOnlinePlayers()){
	   	  			if(p.getWorld().getName().equals(getConfig().getString("WORLDTWO"))) {
	   	  				p.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 1220, 1));
	   	  				for(int a = -8; a <= 8; a++) {
	   	  					for(int b = -1; b <= 1; b++){
	   	  						for(int c = -8; c <= 8; c++) {
	   	  							Material list = p.getLocation().getBlock().getRelative(a, b, c).getType();
	   	  							if (list == Material.FIRE){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  							if (list == Material.BEACON){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  							if (list == Material.LAVA){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  						}	   	  					
	   	  					}
	   					}
	   	  				for(int d = -4; d <= 4; d++) {
	   	  					for(int e = -1; e <= 1; e++){
	   	  						for(int f = -4; f <= 4; f++) {
	   	  							Material list2 = p.getLocation().getBlock().getRelative(d, e, f).getType();
	   	  							if (list2 == Material.TORCH){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  							if (list2 == Material.GLOWSTONE){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  							if (list2 == Material.JACK_O_LANTERN){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  						}	   	  					
	   	  					}
	   	  				}
	   	  				for(int g = -3; g <= 3; g++) {
	   	  					for(int h = -1; h <= 1; h++){
	   	  						for(int i = -3; i <= 3; i++) {
	   	  							Material list3 = p.getLocation().getBlock().getRelative(g, h, i).getType();
	   	  							if (list3 == Material.REDSTONE_LAMP_ON){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  						}
	   	  					}
	   	  				}
	   	  			}
	   			}
	   	 	} 	  							   	  	
		}, 0L, 200L);
		
	}
}
