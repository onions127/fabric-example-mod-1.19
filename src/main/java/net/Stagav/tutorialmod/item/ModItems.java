package net.Stagav.tutorialmod.item;

import net.Stagav.tutorialmod.TutorialMod;
import net.Stagav.tutorialmod.item.custom.ModMusicDiscItem;
import net.Stagav.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CONGRATS_MUSIC_DISC = registerItem("congrats_music_disc", new ModMusicDiscItem(7, ModSounds.CONGRATS_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item HERE_MUSIC_DISC = registerItem("here_music_disc", new ModMusicDiscItem(7, ModSounds.HERE_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item AOT_MUSIC_DISC = registerItem("aot_music_disc", new ModMusicDiscItem(7, ModSounds.AOT_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item SASAGEYO_MUSIC_DISC = registerItem("sasageyo_music_disc", new ModMusicDiscItem(7, ModSounds.SASAGEYO_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item SADNESS_AND_SORROW_MUSIC_DISC = registerItem("sadness_and_sorrow_music_disc", new ModMusicDiscItem(7, ModSounds.SADNESS_AND_SORROW_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));
    public static final Item REI_MUSIC_DISC = registerItem("rei_music_disc", new ModMusicDiscItem(7, ModSounds.REI_MUSIC,  new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TutorialMod.LOGGER.debug("registering Mod Items for " + TutorialMod.MOD_ID );
    }


}
