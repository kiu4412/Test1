package com.liyu.pojo;

import java.math.BigDecimal;

public class Goods {
    private Long id;

    private String goodsName;

    private String goodsTitile;

    private String goodsImg;

    private BigDecimal goodsPrice;

    private Integer goodsStock;

    private String goodsDetail;

    public Goods(Long id, String goodsName, String goodsTitile, String goodsImg, BigDecimal goodsPrice, Integer goodsStock, String goodsDetail) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsTitile = goodsTitile;
        this.goodsImg = goodsImg;
        this.goodsPrice = goodsPrice;
        this.goodsStock = goodsStock;
        this.goodsDetail = goodsDetail;
    }

    public Goods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsTitile() {
        return goodsTitile;
    }

    public void setGoodsTitile(String goodsTitile) {
        this.goodsTitile = goodsTitile == null ? null : goodsTitile.trim();
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }
}