package net.Stagav.tutorialmod.item;

import net.Stagav.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup DISCS = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "discs"), () -> new ItemStack(ModItems.CONGRATS_MUSIC_DISC));

}
