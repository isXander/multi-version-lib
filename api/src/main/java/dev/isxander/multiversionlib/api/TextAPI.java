package dev.isxander.multiversionlib.api;

import dev.isxander.multiversionlib.APIRegistrar;
import net.minecraft.text.MutableText;

public interface TextAPI {
    MutableText literal(String literal);

    MutableText translatable(String translationKey);

    static TextAPI get() {
        return APIRegistrar.get().textAPI();
    }
}
