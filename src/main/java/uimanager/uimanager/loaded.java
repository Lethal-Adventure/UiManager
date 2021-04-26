package uimanager.uimanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class loaded implements Listener {
    @EventHandler
    public  void join(PlayerJoinEvent event){
        Player player = event.getPlayer();
        ScoreboardManager m = Bukkit.getScoreboardManager();
        Scoreboard b = m.getNewScoreboard();

        Objective o = b.registerNewObjective("test", "");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName(ChatColor.AQUA + "Lethal Adventure");

        Score gold = o.getScore(ChatColor.WHITE + "Gold: " + ChatColor.GOLD + "1" );

    }
}
