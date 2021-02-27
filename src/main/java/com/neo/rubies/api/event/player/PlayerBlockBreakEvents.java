package com.neo.rubies.api.event.player;

public class PlayerBlockBreakEvents {

    void afterBlockBreak​(net.minecraft.world.World world,
                          net.minecraft.entity.player.PlayerEntity player,
                          net.minecraft.util.math.BlockPos pos,
                          net.minecraft.block.BlockState state,
                          net.minecraft.block.entity.BlockEntity blockEntity){

        System.out.print("Block Broken!");

    }
}
