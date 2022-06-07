
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.packz.item.UnyAmmoItem;
import net.mcreator.packz.item.USMItem;
import net.mcreator.packz.item.TEMPITEM1Item;
import net.mcreator.packz.item.ShootmdownArmorItem;
import net.mcreator.packz.item.ShootmDownSwordItem;
import net.mcreator.packz.item.ShootmDownShovelItem;
import net.mcreator.packz.item.ShootmDownPickaxeItem;
import net.mcreator.packz.item.ShootmDownHoeItem;
import net.mcreator.packz.item.ShootmDownAxeItem;
import net.mcreator.packz.PackzMod;

public class PackzModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PackzMod.MODID);
	public static final RegistryObject<Item> UNY_AMMO = REGISTRY.register("uny_ammo", () -> new UnyAmmoItem());
	public static final RegistryObject<Item> TEMPITEM_1 = REGISTRY.register("tempitem_1", () -> new TEMPITEM1Item());
	public static final RegistryObject<Item> USM = REGISTRY.register("usm", () -> new USMItem());
	public static final RegistryObject<Item> DUMMYENTITY = REGISTRY.register("dummyentity_spawn_egg",
			() -> new ForgeSpawnEggItem(PackzModEntities.DUMMYENTITY, -3368704, -1, new Item.Properties().tab(PackzModTabs.TAB_SHOOTM)));
	public static final RegistryObject<Item> SHOOTM_DOWN_PICKAXE = REGISTRY.register("shootm_down_pickaxe", () -> new ShootmDownPickaxeItem());
	public static final RegistryObject<Item> SHOOTM_DOWN_AXE = REGISTRY.register("shootm_down_axe", () -> new ShootmDownAxeItem());
	public static final RegistryObject<Item> SHOOTM_DOWN_SWORD = REGISTRY.register("shootm_down_sword", () -> new ShootmDownSwordItem());
	public static final RegistryObject<Item> SHOOTM_DOWN_SHOVEL = REGISTRY.register("shootm_down_shovel", () -> new ShootmDownShovelItem());
	public static final RegistryObject<Item> SHOOTM_DOWN_HOE = REGISTRY.register("shootm_down_hoe", () -> new ShootmDownHoeItem());
	public static final RegistryObject<Item> SHOOTMDOWN_ARMOR_HELMET = REGISTRY.register("shootmdown_armor_helmet",
			() -> new ShootmdownArmorItem.Helmet());
	public static final RegistryObject<Item> SHOOTMDOWN_ARMOR_CHESTPLATE = REGISTRY.register("shootmdown_armor_chestplate",
			() -> new ShootmdownArmorItem.Chestplate());
	public static final RegistryObject<Item> SHOOTMDOWN_ARMOR_LEGGINGS = REGISTRY.register("shootmdown_armor_leggings",
			() -> new ShootmdownArmorItem.Leggings());
	public static final RegistryObject<Item> SHOOTMDOWN_ARMOR_BOOTS = REGISTRY.register("shootmdown_armor_boots",
			() -> new ShootmdownArmorItem.Boots());
	public static final RegistryObject<Item> SHOOTM_IRON_WOOD = block(PackzModBlocks.SHOOTM_IRON_WOOD, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_LOG = block(PackzModBlocks.SHOOTM_IRON_LOG, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_PLANKS = block(PackzModBlocks.SHOOTM_IRON_PLANKS, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_LEAVES = block(PackzModBlocks.SHOOTM_IRON_LEAVES, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_STAIRS = block(PackzModBlocks.SHOOTM_IRON_STAIRS, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_SLAB = block(PackzModBlocks.SHOOTM_IRON_SLAB, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_FENCE = block(PackzModBlocks.SHOOTM_IRON_FENCE, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_FENCE_GATE = block(PackzModBlocks.SHOOTM_IRON_FENCE_GATE, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_PRESSURE_PLATE = block(PackzModBlocks.SHOOTM_IRON_PRESSURE_PLATE, PackzModTabs.TAB_SHOOTM);
	public static final RegistryObject<Item> SHOOTM_IRON_BUTTON = block(PackzModBlocks.SHOOTM_IRON_BUTTON, PackzModTabs.TAB_SHOOTM);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
