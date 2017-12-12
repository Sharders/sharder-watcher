package org.sharders.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author x.y
 * @date 2017/10/12
 */
public class StoreObj {
    private String name;
    private String filename;
    private String hash;
    private String account;
    private String accountRS;
    private String data;
    private String channel;
    private String description;
    private String type;
    private List<String> parsedTags = new ArrayList<>();
    private String blockId;
    private String txId;
    private long txTimestamp = -1;
    private long blockTimestamp = -1;
}
