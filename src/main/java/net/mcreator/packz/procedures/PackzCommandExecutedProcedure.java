package net.mcreator.packz.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.packz.init.PackzModItems;

import java.util.HashMap;

public class PackzCommandExecutedProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Help")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("USMA: Gives you ammo and USM"), (false));
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("USMA")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PackzModItems.USM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PackzModItems.UNY_AMMO.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Function not found"), (false));
		}
	}
}
