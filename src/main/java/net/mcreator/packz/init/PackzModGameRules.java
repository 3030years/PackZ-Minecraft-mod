
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packz.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PackzModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ALLOWSHOOTM = GameRules.register("allowShootm", GameRules.Category.MISC,
			GameRules.BooleanValue.create(true));
}
