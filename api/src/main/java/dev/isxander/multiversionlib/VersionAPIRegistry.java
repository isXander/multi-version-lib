package dev.isxander.multiversionlib;

import java.lang.reflect.InvocationTargetException;

final class VersionAPIRegistry {
    private static final String implClassName = "dev.isxander.multiversionlib.impl.APIRegistrarImpl";

    static APIRegistrar getImpl() {
        try {
            return (APIRegistrar) Class.forName(implClassName).getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException | ClassCastException e) {
            throw new RuntimeException("multi-version-lib implementation not found.");
        }
    }
}
