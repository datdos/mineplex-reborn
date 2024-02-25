package nautilus.game.arcade.game.games.snake.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import mineplex.core.common.util.C;
import mineplex.core.game.kit.GameKit;
import mineplex.core.itemstack.ItemStackFactory;

import nautilus.game.arcade.ArcadeManager;
import nautilus.game.arcade.kit.Kit;

public class KitReverser extends Kit
{

	private static final ItemStack[] PLAYER_ITEMS =
			{
					ItemStackFactory.Instance.CreateStack(Material.COOKIE, (byte) 0, 3, C.cYellow + C.Bold + "Click" + C.cWhite + C.Bold + " - " + C.cGreen + C.Bold + "Reverse")
			};

	public KitReverser(ArcadeManager manager)
	{
		super(manager, GameKit.SNAKE_REVERSE);
	}

	@Override
	public void GiveItems(Player player)
	{
		player.getInventory().addItem(PLAYER_ITEMS);
	}
}
