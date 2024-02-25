package mineplex.core.botspam.command;

import org.bukkit.entity.Player;

import mineplex.core.botspam.BotSpamManager;
import mineplex.core.botspam.SpamText;
import mineplex.core.command.CommandBase;
import mineplex.core.common.util.F;
import mineplex.core.common.util.UtilPlayer;

public class BotSpamDisableCommand extends CommandBase<BotSpamManager>
{
	public BotSpamDisableCommand(BotSpamManager plugin)
	{
		super(plugin, BotSpamManager.Perm.TOGGLE_BOTSPAM_COMMAND, "disable");
	}

	@Override
	public void Execute(final Player caller, String[] args)
	{
		if (args != null && args.length == 1)
		{
			final int spamId;

			try
			{
				spamId = Integer.parseInt(args[0]);
			}
			catch (Exception e)
			{
				UtilPlayer.message(caller, F.main("BotSpam", "/botspam disable <text id>"));
				return;
			}

			SpamText text = null;
			for (SpamText spamText : Plugin.getSpamTexts())
			{
				if (spamText.getId() == spamId)
					text = spamText;
			}

			if (text == null)
			{
				UtilPlayer.message(caller, F.main("BotSpam", "Could not find a spam text with the id " + F.elem("" + spamId)));
				return;
			}

			if (!text.isEnabled())
			{
				UtilPlayer.message(caller, F.main("BotSpam", "That spam text is already disabled"));
				return;
			}

			final SpamText finalText = text;
			Plugin.disableSpamText(caller.getName(), text, () -> UtilPlayer.message(caller, F.main("BotSpam", "Disabled Spam Text " + F.elem(finalText.getText()))));
		}
		else
		{
			UtilPlayer.message(caller, F.main("BotSpam", "/botspam disable <text id>"));
		}
	}
}