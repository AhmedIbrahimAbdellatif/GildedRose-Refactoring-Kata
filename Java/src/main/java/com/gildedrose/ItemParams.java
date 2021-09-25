package com.gildedrose;

public class ItemParams {
    public static int[] getItemParams(int sellIn, int quality) {
        int [] itemParams = new int[2];
        itemParams[ItemParamIndex.SELLIN_INDEX.getValue()] = sellIn;
        itemParams[ItemParamIndex.QUALITY_INDEX.getValue()] = quality;
        return itemParams;
    }
}
