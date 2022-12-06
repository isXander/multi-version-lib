package dev.isxander.multiversionlib.impl;

import dev.isxander.multiversionlib.APIRegistrar;
import dev.isxander.multiversionlib.api.TextAPI;

public class APIRegistrarImpl implements APIRegistrar {
    @Override
    public TextAPI textAPI() {
        return TextAPIImpl.INSTANCE;
    }
}
