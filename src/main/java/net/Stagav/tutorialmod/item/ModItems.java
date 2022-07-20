package net.Stagav.tutorialmod.item;

import net.Stagav.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item STICK = registerItem("stick", new Item(new FabricItemSettings().group(ModItemGroup.OP_WEAPONS)));

    public static final Item DIAMOND_STICK = registerItem("diamond_stick", new Item(new FabricItemSettings().group(ModItemGroup.OP_WEAPONS)));



    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);

    }


    public static void registerModItems() {
        TutorialMod.LOGGER.debug("registering Mod Items for " + TutorialMod.MOD_ID );
    }


}
