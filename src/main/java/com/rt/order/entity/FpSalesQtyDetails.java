package com.rt.order.entity;

/**
 * fp_sales_qty_detail
 *
 * @author dexu.tian
 * @date 2021-03-04 17:12:14
 */
public class FpSalesQtyDetails {
    /**
     * 自增主键id
     */
    private Long id;

    /**
     * 门店编号
     */
    private String storeId;

    /**
     * 子单全局业务id
     */
    private String subOrderId;

    /**
     * 订单号
     */
    private Long ono;

    /**
     * 截单时间
     */
    private Long deadlineTime;

    /**
     * 商品货号
     */
    private Integer skuCode;

    /**
     * 购买数量（订单为正、退订为负）
     */
    private Integer qty;

    /**
     * 写入时间
     */
    private Long insertTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 默认值1,1-正常订单,2-已退订
     */
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId == null ? null : subOrderId.trim();
    }

    public Long getOno() {
        return ono;
    }

    public void setOno(Long ono) {
        this.ono = ono;
    }

    public Long getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Long deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Integer getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(Integer skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}