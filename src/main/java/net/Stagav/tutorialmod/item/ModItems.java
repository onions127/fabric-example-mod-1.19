package net.Stagav.tutorialmod.item;

import net.Stagav.tutorialmod.TutorialMod;
import net.Stagav.tutorialmod.item.custom.ModMusicDiscItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Identifier congrats = new Identifier("tutorialmod:congrats");
    public static SoundEvent play_congrats = new SoundEvent(congrats);
    public static final Identifier here = new Identifier("tutorialmod:here");
    public static SoundEvent play_here = new SoundEvent(here);

    public static final Item CONGRATS_MUSIC_DISC = registerItem("congrats_music_disc", new ModMusicDiscItem(7, play_congrats,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item HERE_MUSIC_DISC = registerItem("here_music_disc", new ModMusicDiscItem(7, play_here,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TutorialMod.LOGGER.debug("registering Mod Items for " + TutorialMod.MOD_ID );
    }


}
