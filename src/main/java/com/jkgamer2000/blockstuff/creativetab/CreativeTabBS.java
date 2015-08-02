package com.jkgamer2000.blockstuff.creativetab;

import com.jkgamer2000.blockstuff.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBS
{
    public static final CreativeTabs BS = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
