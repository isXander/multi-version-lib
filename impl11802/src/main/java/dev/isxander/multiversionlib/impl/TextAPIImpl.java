package dev.isxander.multiversionlib.impl;

import dev.isxander.multiversionlib.api.TextAPI;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableText;

enum TextAPIImpl implements TextAPI {
    INSTANCE;

    @Override
    public MutableText literal(String literal) {
        return new LiteralText(literal);
    }

    @Override
    public MutableText translatable(String translationKey) {
        return new TranslatableText(translationKey);
    }
}
