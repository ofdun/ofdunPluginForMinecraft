package ofdun.minecraft.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import java.util.Random;;

public class AppCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equals("bebra")) {
                ItemStack bebra = new ItemStack(Material.SUGAR);
                bebra.setAmount(1);

                ItemMeta bebraMeta = bebra.getItemMeta();
                bebraMeta.setDisplayName("Бебра");

                bebra.setItemMeta(bebraMeta);

                player.getInventory().addItem(bebra);

                return true;
            }

            if (cmd.getName().equals("squirt")) {

                Random rand = new Random();

                int number = rand.nextInt(1000) + 500;
                final int volume_of_splash = 10;
                final int pitch_of_splash = 1;

                player.spawnParticle(Particle.WATER_SPLASH,
                        player.getLocation().getX(),
                        player.getLocation().getY() + 0.3,
                        player.getLocation().getZ(), number);

                player.playSound(player.getLocation(), Sound.ENTITY_FISHING_BOBBER_SPLASH, volume_of_splash,
                        pitch_of_splash);
                return true;
            }
        }

        return false;
    }
}
