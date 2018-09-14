package com.bewitchment.common.lib;

import com.bewitchment.common.item.ModItems;
import com.bewitchment.common.item.magic.ItemFumes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreIngredient;

public class LibIngredients {

	//TODO any time we call Ingredient.from*, the call should be cached here and used multiple times

	public static Ingredient blazePowder = Ingredient.fromItem(Items.BLAZE_POWDER);
	public static Ingredient goldNugget = Ingredient.fromItem(Items.GOLD_NUGGET);
	public static Ingredient dirt = Ingredient.fromStacks(new ItemStack(Blocks.DIRT, 1, 0));
	public static Ingredient stickyPiston = Ingredient.fromStacks(new ItemStack(Blocks.STICKY_PISTON, 1, 0));
	public static Ingredient sponge = Ingredient.fromStacks(new ItemStack(Blocks.SPONGE, 1, 0));
	public static Ingredient anyLog = new OreIngredient("logWood");
	public static Ingredient acaciaLog = Ingredient.fromStacks(new ItemStack(Blocks.LOG2, 1, 0));

	public static Ingredient dimensionalSand = Ingredient.fromItem(ModItems.dimensional_sand);
	public static Ingredient normalRitualChalk = Ingredient.fromStacks(new ItemStack(ModItems.ritual_chalk));
	public static Ingredient fumeFieryBreeze = Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, ItemFumes.Type.fiery_breeze.ordinal()));
	public static Ingredient fumeHeavenlyWind = Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, ItemFumes.Type.heavenly_winds.ordinal()));
	public static Ingredient fumeCleansingAura = Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, ItemFumes.Type.cleansing_aura.ordinal()));
	public static Ingredient ectoplasm = Ingredient.fromItem(ModItems.ectoplasm);
	public static Ingredient graveyardDust = Ingredient.fromItem(ModItems.graveyard_dust);
	public static Ingredient wormwood = Ingredient.fromItem(ModItems.wormwood);
	public static Ingredient empty_honeycomb = Ingredient.fromItem(ModItems.empty_honeycomb);
	public static Ingredient hoof = Ingredient.fromItem(ModItems.hoof);
}
