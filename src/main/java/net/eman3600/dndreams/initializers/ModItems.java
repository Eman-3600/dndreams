package net.eman3600.dndreams.initializers;

import net.eman3600.dndreams.Initializer;
import net.eman3600.dndreams.items.*;
import net.eman3600.dndreams.items.consumable.DreamEye;
import net.eman3600.dndreams.items.consumable.MaterializeTome;
import net.eman3600.dndreams.items.consumable.IcyNeedle;
import net.eman3600.dndreams.items.consumable.NightmareFuel;
import net.eman3600.dndreams.items.mindstring_bow.LightstringBow;
import net.eman3600.dndreams.items.mindstring_bow.MindstringBow;
import net.eman3600.dndreams.items.tool_mirror.ModAxeItem;
import net.eman3600.dndreams.items.tool_mirror.ModHoeItem;
import net.eman3600.dndreams.items.tool_mirror.ModPickaxeItem;
import net.eman3600.dndreams.items.tool_mirror.ModShovelItem;
import net.eman3600.dndreams.items.trinket.PhantomNecklace;
import net.eman3600.dndreams.util.ModArmorMaterials;
import net.eman3600.dndreams.util.ModFoodComponents;
import net.eman3600.dndreams.util.ModMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    /*
     * Declaration
     * */

    // Dream Powder
    public static final Item DREAM_POWDER = registerItem("dream_powder",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Sculk Powder
    public static final Item SCULK_POWDER = registerItem("sculk_powder",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Shade Veil
    public static final Item SHADE_CLOTH = registerItem("shade_cloth", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // World Flow
    public static final Item LIQUID_VOID = registerItem("liquid_void",
            new Item(new FabricItemSettings().group(ItemGroup.BREWING).recipeRemainder(Items.GLASS_BOTTLE).rarity(Rarity.UNCOMMON)));

    // Liquid Soul
    public static final Item LIQUID_SOUL = registerItem("liquid_soul",
            new Item(new FabricItemSettings().group(ItemGroup.BREWING).recipeRemainder(Items.GLASS_BOTTLE).rarity(Rarity.RARE)));

    // Nightmare Fuel
    public static final Item NIGHTMARE_FUEL = registerItem("nightmare_fuel",
            new NightmareFuel(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.NIGHTMARE_FUEL)));

    // End Sticks
    public static final Item END_STICK = registerItem("end_stick", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Corrupt Scrap & Raw Celestium
    public static final Item CORRUPT_SCRAP = registerItem("corrupt_scrap", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)
            .fireproof()));
    public static final Item RAW_CELESTIUM = registerItem("raw_celestium",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Baleful Residue
    public static final Item BLIGHT_POWDER = registerItem("blight_powder", new BlightPowderItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Water Artichoke Globe
    public static final Item WATER_ARTICHOKE_GLOBE = registerItem("water_artichoke_globe",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Ingots
    public static final Item CORRUPT_INGOT = registerItem("corrupt_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).fireproof()));
    public static final Item HOLY_INGOT = registerItem("holy_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item MANAGOLD_INGOT = registerItem("managold_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TORMITE_INGOT = registerItem("tormite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    // Hellsteel Sword & Tools
    public static final Item CORRUPT_SWORD = registerItem("corrupt_sword",
            new CorruptSword(ModMaterials.CORRUPT, 3, -1.8F,
            new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item CORRUPT_PICKAXE = registerItem("corrupt_pickaxe",
            new CorruptPickaxe(ModMaterials.CORRUPT, 1, -2.4F,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item CORRUPT_AXE = registerItem("corrupt_axe",
            new CorruptAxe(ModMaterials.CORRUPT, 5.0F, -2.9F,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item CORRUPT_SHOVEL = registerItem("corrupt_shovel",
            new CorruptShovel(ModMaterials.CORRUPT, 1.5F, -3.0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item CORRUPT_HOE = registerItem("corrupt_hoe",
            new CorruptHoe(ModMaterials.CORRUPT, -3, 0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    // Flint and Hellsteel
    public static final Item FLINT_AND_HELLSTEEL = registerItem("flint_and_hellsteel", new FlintAndHellsteel(new FabricItemSettings()
            .group(ItemGroup.TOOLS).fireproof().maxCount(1)));


    // Celestium Swords & Tools
    public static final Item HOLY_SWORD = registerItem("holy_sword",
            new SwordItem(ModMaterials.HOLY, 3, -2.8F,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item HOLY_PICKAXE = registerItem("holy_pickaxe",
            new ModPickaxeItem(ModMaterials.HOLY, 1, -2.8F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item HOLY_AXE = registerItem("holy_axe",
            new ModAxeItem(ModMaterials.HOLY, 5.0F, -3.4F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));


    // Mindstring Bow
    public static final Item MINDSTRING_BOW = registerItem("mindstring_bow",
            new MindstringBow(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(752)));
    public static final Item LIGHTSTRING_BOW = registerItem("lightstring_bow",
            new LightstringBow(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(752)));

    // Managold Gear
    public static final Item MANAGOLD_SWORD = registerItem("managold_sword",
            new SwordItem(ModMaterials.MANAGOLD, 3, -2.4F,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MANAGOLD_PICKAXE = registerItem("managold_pickaxe",
            new ModPickaxeItem(ModMaterials.MANAGOLD, 1, -2.8F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MANAGOLD_AXE = registerItem("managold_axe",
            new ModAxeItem(ModMaterials.MANAGOLD, 6.0F, -3.0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MANAGOLD_SHOVEL = registerItem("managold_shovel",
            new ModShovelItem(ModMaterials.MANAGOLD, 1.5F, -3.0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item MANAGOLD_HOE = registerItem("managold_hoe",
            new ModHoeItem(ModMaterials.MANAGOLD, -2, 0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item MANAGOLD_HELMET = registerItem("managold_helmet",
            new ArmorItem(ModArmorMaterials.MANAGOLD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MANAGOLD_CHESTPLATE = registerItem("managold_chestplate",
            new ArmorItem(ModArmorMaterials.MANAGOLD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MANAGOLD_LEGGINGS = registerItem("managold_leggings",
            new ArmorItem(ModArmorMaterials.MANAGOLD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item MANAGOLD_BOOTS = registerItem("managold_boots",
            new ArmorItem(ModArmorMaterials.MANAGOLD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Tormite Gear
    public static final Item TORMITE_SWORD = registerItem("tormite_sword",
            new SwordItem(ModMaterials.TORMITE, 3, -2.4F,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TORMITE_PICKAXE = registerItem("tormite_pickaxe",
            new ModPickaxeItem(ModMaterials.TORMITE, 1, -2.8F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TORMITE_AXE = registerItem("tormite_axe",
            new ModAxeItem(ModMaterials.TORMITE, 5.0F, -3.0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TORMITE_SHOVEL = registerItem("tormite_shovel",
            new ModShovelItem(ModMaterials.TORMITE, 1.5F, -3.0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item TORMITE_HOE = registerItem("tormite_hoe",
            new ModHoeItem(ModMaterials.TORMITE, -4, 0F,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TORMITE_HELMET = registerItem("tormite_helmet",
            new ArmorItem(ModArmorMaterials.TORMITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TORMITE_CHESTPLATE = registerItem("tormite_chestplate",
            new ArmorItem(ModArmorMaterials.TORMITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TORMITE_LEGGINGS = registerItem("tormite_leggings",
            new ArmorItem(ModArmorMaterials.TORMITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TORMITE_BOOTS = registerItem("tormite_boots",
            new ArmorItem(ModArmorMaterials.TORMITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Phantom Necklace
    public static final Item PHANTOM_NECKLACE = registerItem("phantom_necklace",
            new PhantomNecklace(new FabricItemSettings().group(ItemGroup.TRANSPORTATION).maxCount(1).rarity(Rarity.RARE)));




    // Excalibur
    public static final Item EXCALIBUR = registerItem("excalibur",
            new Excalibur(ModMaterials.ARTIFACT, 1, -2.6F,
            new FabricItemSettings().group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON)));




    // Eye of Oneiros
    public static final Item DREAM_EYE = registerItem("dream_eye",
            new DreamEye(new FabricItemSettings().group(ItemGroup.MISC)));

    // Icy Needle
    public static final Item ICY_NEEDLE = registerItem("icy_needle",
            new IcyNeedle(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MATERIALIZE_TOME = registerItem("materialize_tome",
            new MaterializeTome(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE)));

    // Book of Dreams
    public static final Item BOOK_OF_DREAMS = registerItem("book_of_dreams",
            new BookOfDreams(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));



    // Snowbell Seeds
    public static final Item SNOWBELL_SEEDS = registerItem("snowbell_seeds",
            new AliasedBlockItem(ModBlocks.SNOWBELL_CROP, new FabricItemSettings().group(ItemGroup.MISC)));

    // Water Artichoke Seeds
    public static final Item WATER_ARTICHOKE_SEEDS = registerItem("water_artichoke_seeds",
            new AliasedPlaceableOnWaterItem(ModBlocks.WATER_ARTICHOKE, new FabricItemSettings().group(ItemGroup.MISC)));



    /*
     * Item Registration
     * */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initializer.MODID, name), item);
    }

    public static void registerItems() {
        System.out.println("Registering items for " + Initializer.MODID);
    }
}
