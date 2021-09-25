package com.gildedrose;

public class ItemBehaviorFactory {

    public static ItemBehaviorInterface createItemBehavior(String name) {
        ItemBehaviorInterface itemBehavior;
        switch (name) {
            case "Aged Brie":
                itemBehavior = new AgedBrieBehavior();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemBehavior = new BackstageBehavior();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemBehavior = new SulfurasItemBehavior();
                break;
            default:
                itemBehavior = new DefaultItemBehavior();
                break;
        }
        return itemBehavior;
    }
}
