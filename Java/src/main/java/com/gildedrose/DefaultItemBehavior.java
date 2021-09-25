package com.gildedrose;

public class DefaultItemBehavior implements ItemBehaviorInterface {
    @Override
    public int[] updateQuality(int sellIn, int quality) {
        quality = decrementQualityAboveLimit(quality);

        sellIn = decrementSellIn(sellIn);

        quality = decrementQualityAtNegativeSellIn(sellIn, quality);
        return ItemParams.getItemParams(sellIn, quality);
    }

    private int decrementSellIn(int sellIn) {
        sellIn = sellIn - 1;
        return sellIn;
    }

    private int decrementQualityAtNegativeSellIn(int sellIn, int quality) {
        if (sellIn < 0) {
            quality = decrementQualityAboveLimit(quality);
        }
        return quality;
    }

    private int decrementQualityAboveLimit(int quality) {
        if (quality > 0) {
            quality = decrementQuality(quality);
        }
        return quality;
    }

    private int decrementQuality(int quality) {
        quality = quality - 1;
        return quality;
    }
}
