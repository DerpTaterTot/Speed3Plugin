package dev.cibmc.spigot.Speed3;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class App extends JavaPlugin implements Listener{
    @Override
    public void onEnable() {
        getLogger().info("speed3 plugin enabled");
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    PotionEffect Speed = new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 9);

    @EventHandler
    public void mobspawn(CreatureSpawnEvent event) {
        LivingEntity e = event.getEntity();
        
        e.addPotionEffect(Speed);
    }
    
    @Override
    public void onDisable() {
        getLogger().info("speed3 plugin disabled");
    }
}