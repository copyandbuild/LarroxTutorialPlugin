package dev.larrox.larroxTestPlugin.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Larrox implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Du bist kein Spieler, manno.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("§cMir fehlt 1 Argument! :c");
            return true;
        }

        player.sendMessage("Yay, du bist ein Spieler ");
        return true;
    }

}
