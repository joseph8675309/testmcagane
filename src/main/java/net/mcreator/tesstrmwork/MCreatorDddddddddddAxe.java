
package net.mcreator.tesstrmwork;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementstesstrmwork.ModElement.Tag
public class MCreatorDddddddddddAxe extends Elementstesstrmwork.ModElement {
	@ObjectHolder("tesstrmwork:dddddddddddaxe")
	public static final Item block = null;
	public MCreatorDddddddddddAxe(Elementstesstrmwork instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("dddddddddddaxe"));
	}
}
