
package net.mcreator.tesstrmwork;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementstesstrmwork.ModElement.Tag
public class MCreatorDddddddddddHoe extends Elementstesstrmwork.ModElement {
	@ObjectHolder("tesstrmwork:dddddddddddhoe")
	public static final Item block = null;
	public MCreatorDddddddddddHoe(Elementstesstrmwork instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("dddddddddddhoe"));
	}
}
