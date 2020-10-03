package party.lemons.biomemakeover.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import party.lemons.biomemakeover.block.*;
import party.lemons.biomemakeover.util.BlockWithItem;
import party.lemons.biomemakeover.util.DecorationBlockInfo;
import party.lemons.biomemakeover.util.RegistryHelper;

public class BMBlocks
{
    public static final BMMushroomPlantBlock PURPLE_GLOWSHROOM = new GlowshroomPlantBlock(()->BMWorldGen.UNDERGROUND_HUGE_PURPLE_GLOWSHROOM_FEATURE_CONFIGURED, settings(Material.PLANT, 0F).lightLevel(13).noCollision().nonOpaque().sounds(BlockSoundGroup.FUNGUS));
    public static final BMMushroomPlantBlock GREEN_GLOWSHROOM = new GlowshroomPlantBlock(()->BMWorldGen.UNDERGROUND_HUGE_GREEN_GLOWSHROOM_FEATURE_CONFIGURED, settings(Material.PLANT, 0F).lightLevel(13).noCollision().nonOpaque().sounds(BlockSoundGroup.FUNGUS));
    public static final UnderwaterMushroomPlantBlock ORANGE_GLOWSHROOM = new UnderwaterMushroomPlantBlock(()->BMWorldGen.HUGE_ORANGE_GLOWSHROOM_FEATURE_CONFIGURED, settings(Material.PLANT, 0F).lightLevel(13).noCollision().nonOpaque().sounds(BlockSoundGroup.FUNGUS));

    public static final BMMushroomBlock PURPLE_GLOWSHROOM_BLOCK = new BMMushroomBlock(settings(Material.PLANT, 0.2F).lightLevel(15).sounds(BlockSoundGroup.FUNGUS));
    public static final BMMushroomBlock GREEN_GLOWSHROOM_BLOCK = new BMMushroomBlock(settings(Material.PLANT, 0.2F).lightLevel(15).sounds(BlockSoundGroup.FUNGUS));
    public static final BMMushroomBlock ORANGE_GLOWSHROOM_BLOCK = new BMMushroomBlock(settings(Material.PLANT, 0.2F).lightLevel(15).sounds(BlockSoundGroup.FUNGUS));

    public static final MushroomSproutsBlock MYCELIUM_SPROUTS = new MushroomSproutsBlock(settings(Material.field_26708, 0).noCollision().nonOpaque().breakInstantly().sounds(BlockSoundGroup.NETHER_SPROUTS));
	public static final MushroomRootsBlock MYCELIUM_ROOTS = new MushroomRootsBlock(settings(Material.field_26708, 0).noCollision().nonOpaque().breakInstantly().sounds(BlockSoundGroup.ROOTS));
	public static final FlowerPotBlock POTTED_MYCELIUM_ROOTS = new FlowerPotBlock(MYCELIUM_ROOTS, settings(Material.SUPPORTED, 0).breakInstantly().nonOpaque().sounds(BlockSoundGroup.NETHER_SPROUTS));
	public static final FlowerPotBlock POTTED_PURPLE_GLOWSHROOM = new FlowerPotBlock(PURPLE_GLOWSHROOM, settings(Material.SUPPORTED, 0).lightLevel(13).breakInstantly().nonOpaque().sounds(BlockSoundGroup.NETHER_SPROUTS));
	public static final FlowerPotBlock POTTED_GREEN_GLOWSHROOM = new FlowerPotBlock(GREEN_GLOWSHROOM, settings(Material.SUPPORTED, 0).lightLevel(13).breakInstantly().nonOpaque().sounds(BlockSoundGroup.NETHER_SPROUTS));
	public static final FlowerPotBlock POTTED_ORANGE_GLOWSHROOM = new FlowerPotBlock(ORANGE_GLOWSHROOM, settings(Material.SUPPORTED, 0).lightLevel(13).breakInstantly().nonOpaque().sounds(BlockSoundGroup.NETHER_SPROUTS));

	public static final BMTallMushroomBlock TALL_BROWN_MUSHROOM = new BMTallMushroomBlock(Blocks.BROWN_MUSHROOM, settings(Material.PLANT, 0).breakInstantly().noCollision().sounds(BlockSoundGroup.FUNGUS));
    public static final BMTallMushroomBlock TALL_RED_MUSHROOM = new BMTallMushroomBlock(Blocks.RED_MUSHROOM, settings(Material.PLANT, 0).breakInstantly().noCollision().sounds(BlockSoundGroup.FUNGUS));

    public static final BMMushroomBlock GLOWSHROOM_STEM = new BMMushroomBlock(settings(Material.PLANT, 0.2F).lightLevel(7).sounds(BlockSoundGroup.FUNGUS));
    public static final BMBlock RED_MUSHROOM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo RED_MUSHROOM_BRICK_DECORATION = new DecorationBlockInfo("red_mushroom_brick", RED_MUSHROOM_BRICK, settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock BROWN_MUSHROOM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo BROWN_MUSHROOM_BRICK_DECORATION = new DecorationBlockInfo("brown_mushroom_brick", BROWN_MUSHROOM_BRICK, settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock PURPLE_GLOWSHROOM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo PURPLE_GLOWSROOM_BRICK_DECORATION = new DecorationBlockInfo("purple_glowshroom_brick", PURPLE_GLOWSHROOM_BRICK, settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock GREEN_GLOWSHROOM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo GREEN_GLOWSROOM_BRICK_DECORATION = new DecorationBlockInfo("green_glowshroom_brick", GREEN_GLOWSHROOM_BRICK, settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock ORANGE_GLOWSHROOM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo ORANGE_GLOWSROOM_BRICK_DECORATION = new DecorationBlockInfo("orange_glowshroom_brick", ORANGE_GLOWSHROOM_BRICK, settings(Material.PLANT, 0.8F).lightLevel(13).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock GLOWSHROOM_STEM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).lightLevel(7).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo GLOWSHROOM_STEM_BRICK_DECORATION = new DecorationBlockInfo("glowshroom_stem_brick", GLOWSHROOM_STEM_BRICK, settings(Material.PLANT, 0.8F).lightLevel(7).sounds(BlockSoundGroup.FUNGUS)).all();
	public static final BMBlock MUSHROOM_STEM_BRICK = new BMBlock(settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS));
	public static final DecorationBlockInfo MUSHROOM_STEM_BRICK_DECORATION = new DecorationBlockInfo("mushroom_stem_brick", MUSHROOM_STEM_BRICK, settings(Material.PLANT, 0.8F).sounds(BlockSoundGroup.FUNGUS)).all();

	public static void init()
    {
        RegistryHelper.register(Registry.BLOCK, Block.class, BMBlocks.class, (reg, bl, id)->{

            if(!(bl instanceof BlockWithItem))
                return;

            BlockWithItem info = (BlockWithItem)bl;
            if(!info.hasItem())
                return;

            Registry.register(Registry.ITEM, id, info.makeItem());
        });

        RED_MUSHROOM_BRICK_DECORATION.register();
        BROWN_MUSHROOM_BRICK_DECORATION.register();
        PURPLE_GLOWSROOM_BRICK_DECORATION.register();
        GREEN_GLOWSROOM_BRICK_DECORATION.register();
        ORANGE_GLOWSROOM_BRICK_DECORATION.register();
        GLOWSHROOM_STEM_BRICK_DECORATION.register();
        MUSHROOM_STEM_BRICK_DECORATION.register();
    }

    public static FabricBlockSettings settings(Material material, float hardness)
    {
        return FabricBlockSettings.of(material).hardness(hardness).resistance(hardness);
    }
}
