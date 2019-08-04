package com.example.demo.entity;

import org.springframework.util.StringUtils;

public class SettleInfo extends BaseEntity {

    /** 贷款id */
    private long   settleId;

    private String   sourceSettleId;

    private long   loanId;

    private long   sourceLoanId;

    private String   statementId;

    /** 资产id */
    private long   productId;

    private long   sourceProductId;

    private long   domainId;

    private long   sourceDomainId;

    /** 协议id */
    private long   cntrctId;

    /** 到期日期 */
    private int    dueDate;

    private int    paidDate;

    private long   settleAmt;

    private long   settleAmtBal;

    /** 结算状态 */
    private int    settleStatus;

    /** 申请者id */
    private long   applyId;

    /** 申请日期 */
    private int    applyDate;

    /** 数据版本号 */
    private long   version;

    /** 交易状态 */
    private int    status;

    /** 备注信息 */
    private String comment;

    /** 预留字段1 */
    private long   reserved1;

    /** 预留字段2 */
    private String reserved2;

    private int installmentNum;

    private long amount;

    private long billRefNo;

    private int billType;

    private long relatedId;

    private String sourceRelatedId;

    private int settleType;

    private int loanStatus;

    private int accountStatus;

    /**
     * Getter method for property <tt>settleId</tt>.
     *
     * @return property value of settleId
     */
    public long getSettleId() {
        return settleId;
    }

    /**
     * Setter method for property <tt>settleId</tt>.
     *
     * @param settleId
     *            value to be assigned to property settleId
     */
    public void setSettleId(long settleId) {
        this.settleId = settleId;
    }

    /**
     * Getter method for property <tt>productId</tt>.
     *
     * @return property value of productId
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Setter method for property <tt>productId</tt>.
     *
     * @param productId
     *            value to be assigned to property productId
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     * Getter method for property <tt>cntrctId</tt>.
     *
     * @return property value of cntrctId
     */
    public long getCntrctId() {
        return cntrctId;
    }

    /**
     * Setter method for property <tt>cntrctId</tt>.
     *
     * @param cntrctId
     *            value to be assigned to property cntrctId
     */
    public void setCntrctId(long cntrctId) {
        this.cntrctId = cntrctId;
    }

    /**
     * Getter method for property <tt>applyId</tt>.
     *
     * @return property value of applyId
     */
    public long getApplyId() {
        return applyId;
    }

    /**
     * Setter method for property <tt>applyId</tt>.
     *
     * @param applyId
     *            value to be assigned to property applyId
     */
    public void setApplyId(long applyId) {
        this.applyId = applyId;
    }

    /**
     * Getter method for property <tt>applyDate</tt>.
     *
     * @return property value of applyDate
     */
    public int getApplyDate() {
        return applyDate;
    }

    /**
     * Setter method for property <tt>applyDate</tt>.
     *
     * @param applyDate
     *            value to be assigned to property applyDate
     */
    public void setApplyDate(int applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Getter method for property <tt>dueDate</tt>.
     *
     * @return property value of dueDate
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     * Setter method for property <tt>dueDate</tt>.
     *
     * @param dueDate
     *            value to be assigned to property dueDate
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter method for property <tt>settleStatus</tt>.
     *
     * @return property value of settleStatus
     */
    public int getSettleStatus() {
        return settleStatus;
    }

    /**
     * Setter method for property <tt>settleStatus</tt>.
     *
     * @param settleStatus
     *            value to be assigned to property settleStatus
     */
    public void setSettleStatus(int settleStatus) {
        this.settleStatus = settleStatus;
    }

    /**
     * Getter method for property <tt>version</tt>.
     *
     * @return property value of version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Setter method for property <tt>version</tt>.
     *
     * @param version
     *            value to be assigned to property version
     */
    public void setVersion(long version) {
        this.version = version;
    }

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     *
     * @param status
     *            value to be assigned to property status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>comment</tt>.
     *
     * @return property value of comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter method for property <tt>comment</tt>.
     *
     * @param comment
     *            value to be assigned to property comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Getter method for property <tt>reserved1</tt>.
     *
     * @return property value of reserved1
     */
    public long getReserved1() {
        return reserved1;
    }

    /**
     * Setter method for property <tt>reserved1</tt>.
     *
     * @param reserved1
     *            value to be assigned to property reserved1
     */
    public void setReserved1(long reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * Getter method for property <tt>reserved2</tt>.
     *
     * @return property value of reserved2
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * Setter method for property <tt>reserved2</tt>.
     *
     * @param reserved2
     *            value to be assigned to property reserved2
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getSourceSettleId() {
        return sourceSettleId;
    }

    public void setSourceSettleId(String sourceSettleId) {
        this.sourceSettleId = sourceSettleId;
    }

    public long getSourceProductId() {
        return sourceProductId;
    }

    public void setSourceProductId(long sourceProductId) {
        this.sourceProductId = sourceProductId;
    }

    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    public long getSourceDomainId() {
        return sourceDomainId;
    }

    public void setSourceDomainId(long sourceDomainId) {
        this.sourceDomainId = sourceDomainId;
    }

    public int getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(int paidDate) {
        this.paidDate = paidDate;
    }

    public long getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(long settleAmt) {
        this.settleAmt = settleAmt;
    }

    public long getSettleAmtBal() {
        return settleAmtBal;
    }

    public void setSettleAmtBal(long settleAmtBal) {
        this.settleAmtBal = settleAmtBal;
    }

    public long getLoanId() {
        return loanId;
    }

    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    public long getSourceLoanId() {
        return sourceLoanId;
    }

    public void setSourceLoanId(long sourceLoanId) {
        this.sourceLoanId = sourceLoanId;
    }

    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public int getInstallmentNum() {
        return installmentNum;
    }

    public void setInstallmentNum(int installmentNum) {
        this.installmentNum = installmentNum;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBillRefNo() {
        return billRefNo;
    }

    public void setBillRefNo(long billRefNo) {
        this.billRefNo = billRefNo;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(long relatedId) {
        this.relatedId = relatedId;
    }

    public String getSourceRelatedId() {
        if(StringUtils.isEmpty(sourceRelatedId)){
            return "";
        }
        return sourceRelatedId;
    }

    public void setSourceRelatedId(String sourceRelatedId) {
        this.sourceRelatedId = sourceRelatedId;
    }

    public int getSettleType() {
        return settleType;
    }

    public void setSettleType(int settleType) {
        this.settleType = settleType;
    }

    public int getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(int loanStatus) {
        this.loanStatus = loanStatus;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }
}
