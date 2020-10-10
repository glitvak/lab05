package com.example.lab05.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    private static final LinkedList<String> wordList = new LinkedList<>();
    private static final LinkedList<String> imgList = new LinkedList<>();
    private static final LinkedList<String> priceList = new LinkedList<>();
    private static final LinkedList<String> infoList = new LinkedList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    private static void loadItems() {
        wordList.add("Milk");
        imgList.add("milk");
        priceList.add("$5.00");
        infoList.add("A whitish liquid containing proteins, fats, lactose, and various vitamins and minerals that is produced by the mammary glands of all mature female mammals.");

        wordList.add("Eggs");
        imgList.add("eggs");
        priceList.add("$2.33");
        infoList.add("Eggs are laid by female animals of many different species");

        wordList.add("Water");
        imgList.add("water");
        priceList.add("$1.99");
        infoList.add("Water is an inorganic, transparent, tasteless, odorless, and nearly colorless chemical substance");

        wordList.add("Tomatoes");
        imgList.add("tomato");
        priceList.add("$3.00");
        infoList.add("The tomato is the edible, often red berry of the plant Solanum lycopersicum, commonly known as a tomato plant.");

        wordList.add("Pizza");
        imgList.add("pizza");
        priceList.add("$1.99");
        infoList.add("savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients");

        wordList.add("Cheese");
        imgList.add("cheese");
        priceList.add("$4.50");
        infoList.add("dairy product, derived from milk and produced in wide ranges of flavours, textures and forms by coagulation of the milk protein casein.");

        wordList.add("Ground Beef");
        imgList.add("beef");
        priceList.add("$5.00");
        infoList.add("Ground beef, minced beef or beef mince is beef that has been finely chopped with a knife or a meat grinder or mincing machine.");

        wordList.add("Bananas");
        imgList.add("banana");
        priceList.add("$1.50");
        infoList.add("A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.");

        wordList.add("Apples");
        imgList.add("apple");
        priceList.add("$2.00");
        infoList.add("An apple is an edible fruit produced by an apple tree.");

        wordList.add("Onions");
        imgList.add("onion");
        priceList.add("$1.50");
        infoList.add("The onion, also known as the bulb onion or common onion, is a vegetable that is the most widely cultivated species of the genus Allium.");

        wordList.add("Potatoes");
        imgList.add("potato");
        priceList.add("$3.20");
        infoList.add("The potato is a root vegetable native to the Americas, a starchy tuber of the plant Solanum tuberosum.");
    }

    static
    {
        loadItems();
        for (int i =0; i < wordList.size(); i++){
            DummyItem item = createDummyItem(String.valueOf(i), wordList.get(i), infoList.get(i), priceList.get(i), imgList.get(i));
            addItem(item);
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(String position, String content, String details, String price, String img) {
        return new DummyItem(position, content, details , price, img);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String price;
        public final String img;

        public DummyItem(String id, String content, String details, String price, String img) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.price = price;
            this.img = img;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}