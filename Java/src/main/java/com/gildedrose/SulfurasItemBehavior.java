package com.gildedrose;

public class SulfurasItemBehavior implements ItemBehaviorInterface {
    @Override
    public int[] updateQuality(int sellIn, int quality) {
        return ItemParams.getItemParams(sellIn, quality);
    }
}
