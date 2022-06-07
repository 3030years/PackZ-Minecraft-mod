
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packz.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PackzModTabs {
	public static CreativeModeTab TAB_SHOOTM;

	public static void load() {
		TAB_SHOOTM = new CreativeModeTab("tabshootm") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.KNOWLEDGE_BOOK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
