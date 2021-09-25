package com.gildedrose;

public class AgedBrieBehavior implements ItemBehaviorInterface {
    @Override
    public int[] updateQuality(int sellIn, int quality) {
        quality = incrementQualityBelowLimit(quality);
        sellIn = decrementSellIn(sellIn);
        quality = modifyQualityAtZeroSellIn(sellIn, quality);
        return ItemParams.getItemParams(sellIn, quality);
    }

    private int modifyQualityAtZeroSellIn(int sellIn, int quality) {
        if (sellIn < 0) {
            quality = incrementQualityBelowLimit(quality);
        }
        return quality;
    }

    private int decrementSellIn(int sellIn) {
        sellIn = sellIn - 1;
        return sellIn;
    }

    private int incrementQualityBelowLimit(int quality) {
        if (quality < 50) {
            quality = incrementQuality(quality);
        }
        return quality;
    }

    private int incrementQuality(int quality) {
        quality = quality + 1;
        return quality;
    }
}
