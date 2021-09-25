package com.gildedrose;

public enum ItemParamIndex {
    SELLIN_INDEX(0),
    QUALITY_INDEX(1);

    private final int value;
    private ItemParamIndex(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
