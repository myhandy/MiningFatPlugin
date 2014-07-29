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
	   	  				int radiustorch = 4;
	   	  				int radiusfire = 8;
	   	  				int radiuslavasource = 12;
	   	  				int radiusflowinglava = 10;
	   	  				int radiusbeacon = 8;
	   	  				int radiusglowstone = 6;
	   	  				int radiusredstonelampon = 3;
	   	  				int radiusjackolanter = 4;
	   	  				for(int a = -radiustorch; a <= radiustorch; a++) {
	   	  					for(int b = -radiustorch; b <= radiustorch; b++){
	   	  						for(int c = -radiustorch; c <= radiustorch; c++) {
	   	  							if(p.getLocation().getBlock().getRelative(a, b, c).getType() == Material.TORCH){
	   	  								if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  									p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  								}
	   	  								return;
	   	  							}
	   	  						}
	   	  					}
	   	  				for(int v = -radiusfire; v <= radiusfire; v++) {
	   		   	  			for(int w = -radiusfire; w <= radiusfire; w++) {
	   		   	  				for(int x = -radiusfire; x <= radiusfire; x++) {
	   	  								if(p.getLocation().getBlock().getRelative(v, w, x).getType() == Material.FIRE){
	   	  									if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  										p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  									}
	   	  									return;
	   	  								}
	   		   	  				}
	   		   	  			}
	   		   	  			for(int d = -radiusbeacon; d <= radiusbeacon; d++) {
		   		   	  			for(int e = -radiusbeacon; e <= radiusbeacon; e++) {
		   		   	  				for(int f = -radiusbeacon; f <= radiusbeacon; f++) {
	   	  									if(p.getLocation().getBlock().getRelative(d, e, f).getType() == Material.BEACON){
	   	  										if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  											p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  										}
	   	  										return;
	   	  								}
		   	  						}
		   	  					}
		   	  				for(int g = -radiusflowinglava; g <= radiusflowinglava; g++) {
		   		   	  			for(int h = -radiusflowinglava; h <= radiusflowinglava; h++) {
		   		   	  				for(int i = -radiusflowinglava; i <= radiusflowinglava; i++) {
	   	  									if(p.getLocation().getBlock().getRelative(g, h, i).getType() == Material.LAVA){
	   	  										if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  											p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  										}
	   	  										return;
	   	  								}
		   		   	  				}
		   		   	  			}
		   		   	  		for(int i = -radiuslavasource; i <= radiuslavasource; i++) {
		   		   	  				for(int j = -radiuslavasource; j <= radiuslavasource; j++) {
	   		   	  				for(int k = -radiuslavasource; k <= radiuslavasource; k++) {
	   	  											if(p.getLocation().getBlock().getRelative(i, j, k).getType() == Material.STATIONARY_LAVA){
	   	  												if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	   	  													p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	   	  												}
	   	  												return;
	   	  										}
	   		   	  				}
	   		   	  			}
	   		   	  		for(int l = -radiusglowstone; l <= radiusglowstone; l++) {
	   		   	  			for(int m = -radiusglowstone; m <= radiusglowstone; m++) {
   		   	  				for(int n = -radiusglowstone; n <= radiusglowstone; n++) {
   	  											if(p.getLocation().getBlock().getRelative(l, m, n).getType() == Material.GLOWSTONE){
   	  												if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
   	  													p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
   	  												}
   	  												return;
   	  												
   	  										}
   		   	  				}
   		   	  			}
   		   	  		for(int o = -radiusredstonelampon; o <= radiusredstonelampon; o++) {
   		   	  				for(int q = -radiusredstonelampon; q <= radiusredstonelampon; q++) {
		   	  				for(int r = -radiusredstonelampon; r <= radiusredstonelampon; r++) {
	  											if(p.getLocation().getBlock().getRelative(o, q, r).getType() == Material.REDSTONE_LAMP_ON){
	  												if(p.getPlayer().hasPotionEffect(PotionEffectType.SLOW_DIGGING)){
	  													p.getPlayer().removePotionEffect(PotionEffectType.SLOW_DIGGING);
	  												}
	  												return;
	  												
	   	  										}
	   		   	  				}
	   		   	  			}
	   		   	  		for(int s = -radiusjackolanter; s <= radiusjackolanter; s++) {
	   		   	  				for(int t = -radiusjackolanter; t <= radiusjackolanter; t++) {
			   	  				for(int u = -radiusjackolanter; u <= radiusjackolanter; u++) {
		  											if(p.getLocation().getBlock().getRelative(s, t, u).getType() == Material.JACK_O_LANTERN){
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
