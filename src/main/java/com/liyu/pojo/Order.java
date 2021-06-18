package com.liyu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long id;

    private Long userId;

    private Long goodsId;

    private Long delivertyAddrId;

    private String goodsName;

    private Integer goodsCount;

    private BigDecimal goodsPrice;

    private Byte orderChanel;

    private Byte status;

    private Date createDate;

    private Date payDate;

    public Order(Long id, Long userId, Long goodsId, Long delivertyAddrId, String goodsName, Integer goodsCount, BigDecimal goodsPrice, Byte orderChanel, Byte status, Date createDate, Date payDate) {
        this.id = id;
        this.userId = userId;
        this.goodsId = goodsId;
        this.delivertyAddrId = delivertyAddrId;
        this.goodsName = goodsName;
        this.goodsCount = goodsCount;
        this.goodsPrice = goodsPrice;
        this.orderChanel = orderChanel;
        this.status = status;
        this.createDate = createDate;
        this.payDate = payDate;
    }

    public Order() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getDelivertyAddrId() {
        return delivertyAddrId;
    }

    public void setDelivertyAddrId(Long delivertyAddrId) {
        this.delivertyAddrId = delivertyAddrId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Byte getOrderChanel() {
        return orderChanel;
    }

    public void setOrderChanel(Byte orderChanel) {
        this.orderChanel = orderChanel;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}