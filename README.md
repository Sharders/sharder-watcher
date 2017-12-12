Sharders协议中定义的嗅探器服务,主要有以下功能:
* 维护Sharders中已存储数字对象的状态(备份数增减/资源所在节点可用状态变更)
* 负责Sharders中对数据节点上存储的数字对象进行存在性校验
* 负责Sharders中数字对象异常状态的恢复(备份/删除冗余/纠删)
* 作为Sharders的代理服务,预处理上传的数据(加密)
* 为客户端提供当前可用的数字对象的访问

数据MOCK系统使用rap2: [mock-sharders-watcher](http://rap2.taobao.org/)