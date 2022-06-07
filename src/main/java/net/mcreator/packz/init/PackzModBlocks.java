
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.packz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.packz.block.Shootm_IronWoodBlock;
import net.mcreator.packz.block.Shootm_IronStairsBlock;
import net.mcreator.packz.block.Shootm_IronSlabBlock;
import net.mcreator.packz.block.Shootm_IronPressurePlateBlock;
import net.mcreator.packz.block.Shootm_IronPlanksBlock;
import net.mcreator.packz.block.Shootm_IronLogBlock;
import net.mcreator.packz.block.Shootm_IronLeavesBlock;
import net.mcreator.packz.block.Shootm_IronFenceGateBlock;
import net.mcreator.packz.block.Shootm_IronFenceBlock;
import net.mcreator.packz.block.Shootm_IronButtonBlock;
import net.mcreator.packz.PackzMod;

public class PackzModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PackzMod.MODID);
	public static final RegistryObject<Block> SHOOTM_IRON_WOOD = REGISTRY.register("shootm_iron_wood", () -> new Shootm_IronWoodBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_LOG = REGISTRY.register("shootm_iron_log", () -> new Shootm_IronLogBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_PLANKS = REGISTRY.register("shootm_iron_planks", () -> new Shootm_IronPlanksBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_LEAVES = REGISTRY.register("shootm_iron_leaves", () -> new Shootm_IronLeavesBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_STAIRS = REGISTRY.register("shootm_iron_stairs", () -> new Shootm_IronStairsBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_SLAB = REGISTRY.register("shootm_iron_slab", () -> new Shootm_IronSlabBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_FENCE = REGISTRY.register("shootm_iron_fence", () -> new Shootm_IronFenceBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_FENCE_GATE = REGISTRY.register("shootm_iron_fence_gate",
			() -> new Shootm_IronFenceGateBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_PRESSURE_PLATE = REGISTRY.register("shootm_iron_pressure_plate",
			() -> new Shootm_IronPressurePlateBlock());
	public static final RegistryObject<Block> SHOOTM_IRON_BUTTON = REGISTRY.register("shootm_iron_button", () -> new Shootm_IronButtonBlock());
}
