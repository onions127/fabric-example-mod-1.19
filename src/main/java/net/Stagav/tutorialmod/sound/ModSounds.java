package net.Stagav.tutorialmod.sound;

import net.Stagav.tutorialmod.TutorialMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.sound.SoundEvent;

public class ModSounds {

    public static SoundEvent CONGRATS_MUSIC = registerSoundEvent("congrats");

    public static SoundEvent HERE_MUSIC = registerSoundEvent("here");


    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
