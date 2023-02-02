package net.Stagav.tutorialmod.sound;

import net.Stagav.tutorialmod.TutorialMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.sound.SoundEvent;

public class ModSounds {

    public static SoundEvent CONGRATS_MUSIC = registerSoundEvent("congrats");

    public static SoundEvent HERE_MUSIC = registerSoundEvent("here");

    public static SoundEvent AOT_MUSIC = registerSoundEvent("aot");

    public static SoundEvent SASAGEYO_MUSIC = registerSoundEvent("sasageyo");

    public static SoundEvent SADNESS_AND_SORROW_MUSIC = registerSoundEvent("sadness_and_sorrow");


    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
