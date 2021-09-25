package com.gildedrose;

public class BackstageBehavior implements ItemBehaviorInterface {
    @Override
    public int[] updateQuality(int sellIn, int quality) {
        quality = backstageModifiyQuality(sellIn, quality);
        sellIn = decrementSellIn(sellIn);
        quality = expireQuailityAtZeroSellIn(sellIn, quality);
        return ItemParams.getItemParams(sellIn, quality);
    }

    private int backstageModifiyQuality(int sellIn, int quality) {
        if (quality < 50) {
            quality = incrementQuality(quality);
            quality = modifyQualityAccordingToSellIn(sellIn, quality);
        }
        return quality;
    }

    private int expireQuailityAtZeroSellIn(int sellIn, int quality) {
        if (sellIn < 0) {
            quality = 0;
        }
        return quality;
    }

    private int decrementSellIn(int sellIn) {
        sellIn = sellIn - 1;
        return sellIn;
    }

    private int modifyQualityAccordingToSellIn(int sellIn, int quality) {
        if (sellIn < 11) {
            quality = incrementQualityBelowLimit(quality);
        }
        if (sellIn < 6) {
            quality = incrementQualityBelowLimit(quality);
        }
        return quality;
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
