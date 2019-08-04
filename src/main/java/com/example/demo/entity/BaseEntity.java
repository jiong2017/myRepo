package com.example.demo.entity;

import org.springframework.util.StringUtils;

public class BaseEntity {

    /**
     * 数据库自增长Id
     */
    private long                id;
    /**
     * 创建时间戳
     */
    private int             created;
    /**
     * 修改时间戳
     */
    private int             updated;
    /**
     * 交易状态
     */
    private int status;
    /**
     * 产品编号
     */
    private long   productId;

    /**
     * 领域编号
     */
    private long   domainId;
    /**
     * 上游产品编号
     */
    private long   sourceProductId;

    /**
     * 上游领域编号
     */
    private long   sourceDomainId;

    /** 数据版本号 */
    private long   version;

    private long oldVersion;

    /** 操作符 */
    private String action;

    /** 预留字段1 */
    private long   reserved1;

    /** 预留字段2 */
    private String reserved2;

    /**
     * 交易金额（发生额）
     */
    private long amount;

    /** 备注信息 */
    private String comment;

    /**
     * 交易码
     */
    private int businessCode;

    /**
     * 交易类型
     */
    private String businessType;


    /** 申请者id */
    private long   applyId;

    /** 申请日期 */
    private int    applyDate;

    /**
     * 上游交易系统编号
     */
    private long tradeId;

    /**
     * 上游交易业务编号
     */
    private String businessRequestId;

    /**
     * 系统master 表ID
     */
    private long masterTransactionId;

    private String productCatalogId;

    private String fundProductCatalogId;


    private int bizType;

    private String productCode; // 2019新定义的产品代码

    private int sceneType; // 2019新定义的场景代码

    private int subSceneType; // 2019新定义的子场景代码

    private String requestId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getReserved1() {
        return reserved1;
    }

    public void setReserved1(long reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(int businessCode) {
        this.businessCode = businessCode;
    }

    public long getSourceProductId() {
        return sourceProductId;
    }

    public void setSourceProductId(long sourceProductId) {
        this.sourceProductId = sourceProductId;
    }

    public long getSourceDomainId() {
        return sourceDomainId;
    }

    public void setSourceDomainId(long sourceDomainId) {
        this.sourceDomainId = sourceDomainId;
    }

    public long getApplyId() {
        return applyId;
    }

    public void setApplyId(long applyId) {
        this.applyId = applyId;
    }

    public int getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(int applyDate) {
        this.applyDate = applyDate;
    }

    public long getOldVersion() {
        return oldVersion;
    }

    public void setOldVersion(long oldVersion) {
        this.oldVersion = oldVersion;
    }

    public long getTradeId() {
        return tradeId;
    }

    public void setTradeId(long tradeId) {
        this.tradeId = tradeId;
    }

    public long getMasterTransactionId() {
        return masterTransactionId;
    }

    public void setMasterTransactionId(long masterTransactionId) {
        this.masterTransactionId = masterTransactionId;
    }

    public String getBusinessRequestId() {
        return businessRequestId;
    }

    public void setBusinessRequestId(String businessRequestId) {
        this.businessRequestId = businessRequestId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getProductCatalogId() {
        if(StringUtils.isEmpty(productCatalogId)){
            productCatalogId = "";
        }
        return productCatalogId;
    }

    public void setProductCatalogId(String productCatalogId) {
        this.productCatalogId = productCatalogId;
    }

    public String getFundProductCatalogId() {
        if(StringUtils.isEmpty(fundProductCatalogId)){
            fundProductCatalogId = "";
        }
        return fundProductCatalogId;
    }

    public void setFundProductCatalogId(String fundProductCatalogId) {
        this.fundProductCatalogId = fundProductCatalogId;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getSceneType() {
        return sceneType;
    }

    public void setSceneType(int sceneType) {
        this.sceneType = sceneType;
    }

    public int getSubSceneType() {
        return subSceneType;
    }

    public void setSubSceneType(int subSceneType) {
        this.subSceneType = subSceneType;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
