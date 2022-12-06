package dev.isxander.multiversionlib.test;

import dev.isxander.multiversionlib.api.TextAPI;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.text.Text;

public class MultiVersionLibTest implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Testing multi-version-lib for 1.18.2");

        try {
            Text translatableText = TextAPI.get().translatable("translation.key");
            Text literalText = TextAPI.get().literal("Literal Text");

            System.out.println("Testing success!");
        } catch (Throwable e) {
            System.out.println("Testing failure!");
        }

        System.exit(0);
    }
}
