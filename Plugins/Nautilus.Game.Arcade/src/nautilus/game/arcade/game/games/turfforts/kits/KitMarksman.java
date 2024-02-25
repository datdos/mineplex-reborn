package nautilus.game.arcade.game.games.turfforts.kits;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import mineplex.core.game.kit.GameKit;
import mineplex.core.itemstack.ItemStackFactory;

import nautilus.game.arcade.ArcadeManager;
import nautilus.game.arcade.kit.Kit;
import nautilus.game.arcade.kit.Perk;
import nautilus.game.arcade.kit.perks.PerkConstructor;
import nautilus.game.arcade.kit.perks.PerkFletcher;

public class KitMarksman extends Kit
{

	private static final Perk[] PERKS =
			{
					new PerkConstructor("Constructor", 4, 8, Material.WOOL, "Wool", false),
					new PerkFletcher(2, 2, false),
			};

	private static final ItemStack[] PLAYER_ITEMS =
			{
					ItemStackFactory.Instance.CreateStack(Material.BOW),
			};

	public KitMarksman(ArcadeManager manager)
	{
		super(manager, GameKit.TURF_WARS_MARKSMAN, PERKS);
	}

	@Override
	public void GiveItems(Player player)
	{
		player.getInventory().addItem(PLAYER_ITEMS);

		player.getInventory().addItem(ItemStackFactory.Instance.CreateStack(Material.WOOL, Manager.GetGame().GetTeam(player).GetColorData(), Manager.GetGame().IsLive() ? 6 : 64));

		Bukkit.getScheduler().scheduleSyncDelayedTask(Manager.getPlugin(), player::updateInventory, 10);
	}
}
