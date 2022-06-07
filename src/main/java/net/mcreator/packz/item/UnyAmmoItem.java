
package net.mcreator.packz.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.packz.procedures.UnyAmmoItemIsCraftedsmeltedProcedure;
import net.mcreator.packz.init.PackzModTabs;

public class UnyAmmoItem extends Item {
	public UnyAmmoItem() {
		super(new Item.Properties().tab(PackzModTabs.TAB_SHOOTM).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		UnyAmmoItemIsCraftedsmeltedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
