package com.jkgamer2000.blockstuff.init;

import com.jkgamer2000.blockstuff.block.BlockBS;
import com.jkgamer2000.blockstuff.block.BlockObsidianGlass;
import com.jkgamer2000.blockstuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBS obsidianGlass = new BlockObsidianGlass();

    public static void init()
    {
        GameRegistry.registerBlock(obsidianGlass, "obsidianGlass");
    }
}
