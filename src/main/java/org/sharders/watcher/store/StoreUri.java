package org.sharders.watcher.store;

/**
 * 数据对象对应的资源包
 * @author x.y
 * @date 2017/12/13
 */
public class StoreUri {
    /** 数据内容(16进制)的访问地址 */
    private String dataUri;
    /** 预览的访问地址:目前支持txt, pdf, png */
    private String previewUri;
    /** 数据对象的下载地址 */
    private String downloadUri;

}
