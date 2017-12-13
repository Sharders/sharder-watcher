package org.sharders.watcher.store;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据对象:在Sharder网络里只有数据对象才能被视为用户能使用的完整数据包.
 * @author x.y
 * @date 2017/10/12
 */
public class StoreObj {
    /** 名称 */
    private String name;
    /** 文件名 */
    private String filename;
    /** hash值 */
    private String hash;
    /** 描述 */
    private String description;
    /** 类型 */
    private String type;
    /** 数据内容 */
    private String data;
    /** 对应的资源包 */
    private StoreUri uri;

    /** 数据隶属用户的ID */
    private String accountId;
    /** 数据隶属用户的别名 */
    private String accountRS;
    /** 数据隶属用户的公钥 */
    private String accountPK;
    /** 数据隶属用户的签名 */
    private String accountSign;
    /** 数据隶属通道 */
    private String channel;
    /** 标签 */
    private List<String> tags = new ArrayList<>();

    /** 数据所在区块 */
    private String blockId;
    /** 数据所在交易 */
    private String txId;
    /** 交易时间戳 */
    private long txTimestamp = -1;
    /** 区块时间戳 */
    private long blockTimestamp = -1;
}
