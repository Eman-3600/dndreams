package net.eman3600.dndreams.initializers;

import net.eman3600.dndreams.Initializer;
import net.eman3600.dndreams.recipe.WeavingRecipe;
import net.eman3600.dndreams.recipe.WeavingShapedRecipe;
import net.eman3600.dndreams.recipe.WeavingShapelessRecipe;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipeTypes {
    // Types

    public static final RecipeType<WeavingRecipe> WEAVING = register("weaving");


    // Serializers

    public static final RecipeSerializer<WeavingShapedRecipe> WEAVING_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER,
            new Identifier(Initializer.MODID, WeavingShapedRecipe.Serializer.ID), WeavingShapedRecipe.Serializer.INSTANCE);
    public static final RecipeSerializer<WeavingShapelessRecipe> WEAVING_SHAPELESS_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER,
            new Identifier(Initializer.MODID, WeavingShapelessRecipe.Serializer.ID), WeavingShapelessRecipe.Serializer.INSTANCE);

    private static <T extends Recipe<?>> RecipeType<T> register(String id) {
        return Registry.register(Registry.RECIPE_TYPE, new Identifier(Initializer.MODID, id), new RecipeType<T>() {
            public String toString() {
                return (new Identifier(Initializer.MODID, id)).toString();
            }
        });
    }

    public static void registerTypes() {
        System.out.println("Registering recipe types for " + Initializer.MODID);
    }
}
