package dev.isxander.multiversionlib;

import dev.isxander.multiversionlib.api.TextAPI;

public interface APIRegistrar {
    TextAPI textAPI();

    static APIRegistrar get() {
        return VersionAPIRegistry.getImpl();
    }
}
