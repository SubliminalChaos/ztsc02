package me.waqe.plugin

import me.waqe.plugin.events.EventsClass
import net.md_5.bungee.api.ChatColor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


class App : JavaPlugin(), Listener {
    override fun onEnable() {
        server.consoleSender.sendMessage(ChatColor.GREEN.toString() + "\n\nTutorial has been Enabled\n\n")
        server.pluginManager.registerEvents(EventsClass(), this)
    }
    override fun onDisable() {
        server.consoleSender.sendMessage(
            """
            ${ChatColor.RED}
            
            Tutorial has been Disabled
            
            
            """.trimIndent()
        )
    }
}
