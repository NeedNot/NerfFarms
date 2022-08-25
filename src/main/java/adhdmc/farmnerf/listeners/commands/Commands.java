package adhdmc.farmnerf.listeners.commands;

import adhdmc.farmnerf.FarmNerf;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Commands implements CommandExecutor, TabCompleter {

    private FarmNerf plugin;

    public Commands(FarmNerf plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender , @NotNull Command command , @NotNull String label , @NotNull String[] args) {
        if (args.length > 0 && args[0].equals("reload") || sender.isOp()) {
            plugin.reloadConfig();
            sender.sendMessage("Reloaded config!");
            return true;
        }
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender , @NotNull Command command , @NotNull String label , @NotNull String[] args) {
// only need this if there are more than one command
//        ArrayList<String> subs = new ArrayList<>(Arrays.asList("reload"));
//        if (args.length == 1 && sender.hasPermission("farmnerf.reload") || sender.isOp()) {
//            return subs;
//        }
        return null;
    }
}
