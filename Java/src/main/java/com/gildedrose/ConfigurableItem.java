package com.gildedrose;

public class ConfigurableItem extends Item{
    public ItemBehaviorInterface itemBehavior;
    public ConfigurableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        itemBehavior = ItemBehaviorFactory.createItemBehavior(name);
        int[] itemParams = itemBehavior.updateQuality(sellIn, quality);
        super.sellIn = itemParams[ItemParamIndex.SELLIN_INDEX.getValue()];
        super.quality = itemParams[ItemParamIndex.QUALITY_INDEX.getValue()];
    }

}
