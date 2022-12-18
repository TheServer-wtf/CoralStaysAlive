package me.saeko.coralstayalive.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

public class fadeListener implements Listener {

    @EventHandler
    public void onBlockFade(BlockFadeEvent event) {

        // Check if the block is a coral block
        if (event.getBlock().getType().name().contains("CORAL")) {

            // if it is found to be coral then stop it from fading ig
            event.setCancelled(true);
        }
    }
}