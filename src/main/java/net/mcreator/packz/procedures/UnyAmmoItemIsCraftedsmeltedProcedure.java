package net.mcreator.packz.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.packz.network.PackzModVariables;

public class UnyAmmoItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PackzModVariables.MapVariables.get(world).TNTX = 0;
		PackzModVariables.MapVariables.get(world).syncData(world);
		for (int index0 = 0; index0 < (int) (5); index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + PackzModVariables.MapVariables.get(world).TNTX), y, z),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:tnt");
			PackzModVariables.MapVariables.get(world).TNTX = PackzModVariables.MapVariables.get(world).TNTX + 1;
			PackzModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
