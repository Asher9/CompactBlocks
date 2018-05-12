package com.asher9.CompactBlocks.world;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.init.CBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;
import java.util.function.Predicate;

public class WorldGen implements IWorldGenerator {

    public WorldGenerator oreEnderium;
    public WorldGenerator oreNetherEnderium;
    public WorldGenerator oreEndEnderium;

    public WorldGen() {
        this.oreEnderium = new WorldGenMinable(CBlocks.oreEnderium.getDefaultState(), 13);
        this.oreNetherEnderium = new WorldGenMinable(CBlocks.oreNetherEnderium.getDefaultState(), 13);
        this.oreEndEnderium = new WorldGenMinable(CBlocks.oreEndEnderium.getDefaultState(), 13);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == -1 && CompactBlocks.config.cache.oreGenNetherEnderiumOre) {
            this.runGenerator(CBlocks.oreNetherEnderium.getDefaultState(), world, random, chunkX, chunkZ, 30, 8, 0, 255, BlockMatcher.forBlock(Blocks.NETHERRACK));
        }
        else if (world.provider.getDimension() == 1 && CompactBlocks.config.cache.oreGenEndEnderiumOre) {
            this.runGenerator(CBlocks.oreEndEnderium.getDefaultState(), world, random, chunkX, chunkZ, 16, 8, 0, 80, BlockMatcher.forBlock(Blocks.END_STONE));
        }
        else if (CompactBlocks.config.cache.oreGenEnderiumOre) {
            this.runGenerator(CBlocks.oreEnderium.getDefaultState(), world, random, chunkX, chunkZ, 5, 13, 10, 50, BlockMatcher.forBlock(Blocks.STONE));
        }
    }

    private void runGenerator(IBlockState ore, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int size, int minHeight, int maxHeight, Predicate predicate) {

    }
}
