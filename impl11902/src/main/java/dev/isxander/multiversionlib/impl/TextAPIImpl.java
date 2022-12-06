package dev.isxander.multiversionlib.impl;

import dev.isxander.multiversionlib.api.TextAPI;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

enum TextAPIImpl implements TextAPI {
    INSTANCE;

    @Override
    public MutableText literal(String literal) {
        return Text.literal(literal);
    }

    @Override
    public MutableText translatable(String translationKey) {
        return Text.translatable(translationKey);
    }
}
