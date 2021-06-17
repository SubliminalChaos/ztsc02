package me.waqe.plugin.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent




class EventsClass : Listener {
    @EventHandler
    fun onMove(event: PlayerMoveEvent?) {
        print(1)
    }
}
