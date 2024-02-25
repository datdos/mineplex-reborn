package nautilus.game.arcade.game.games.spleef.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import mineplex.core.game.kit.GameKit;
import mineplex.core.itemstack.ItemStackFactory;

import nautilus.game.arcade.ArcadeManager;
import nautilus.game.arcade.kit.Kit;
import nautilus.game.arcade.kit.Perk;
import nautilus.game.arcade.kit.perks.PerkKnockback;
import nautilus.game.arcade.kit.perks.PerkLeap;
import nautilus.game.arcade.kit.perks.PerkSmasher;

public class KitBrawler extends Kit
{

	private static final Perk[] PERKS =
			{
					new PerkLeap("Leap", 1.2, 1.2, 6000),
					new PerkSmasher(),
					new PerkKnockback(0.6)
			};

	private static final ItemStack[] PLAYER_ITEMS =
			{
					ItemStackFactory.Instance.CreateStack(Material.IRON_AXE),
			};

	public KitBrawler(ArcadeManager manager)
	{
		super(manager, GameKit.SPLEEF_BRAWLER, PERKS);
	}

	@Override
	public void GiveItems(Player player)
	{
		player.getInventory().addItem(PLAYER_ITEMS);
	}
}
