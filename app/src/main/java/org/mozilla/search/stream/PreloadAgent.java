package org.mozilla.search.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreloadAgent {

  public static List<TmpItem> ITEMS = new ArrayList<TmpItem>();

  public static Map<String, TmpItem> ITEM_MAP = new HashMap<String, TmpItem>();

  static {
    for (int i = 0; i < 200; i++) {
      addItem(new TmpItem(String.valueOf(i), "Item " + String.valueOf(i)));
    }
  }

  private static void addItem(TmpItem item) {
    ITEMS.add(item);
    ITEM_MAP.put(item.id, item);
  }

  public static class TmpItem {
    public String id;
    public String content;

    public TmpItem(String id, String content) {
      this.id = id;
      this.content = content;
    }

    @Override
    public String toString() {
      return content;
    }
  }
}