package com.litb.listing.domain;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
public class ListingTask {

    private Integer id;

    private Integer merchantId;

    private Integer productId;

    private Integer skuId;

    private String skuCode;

    private Short listingBaseinfoStatus;

    private Short listingInventoryStatus;

    private Short listingPricingStatus;

    private Short listingImageStatus;

    private Short listingRelationshipStatus;

    private Short closeStatus;

    private Short refreshInventoryStatus;

    private Short refreshPricingStatus;

    private Integer quantity;

    private Float price;

    private Short fulfillmentLatency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Short getListingBaseinfoStatus() {
        return listingBaseinfoStatus;
    }

    public void setListingBaseinfoStatus(Short listingBaseinfoStatus) {
        this.listingBaseinfoStatus = listingBaseinfoStatus;
    }

    public Short getListingInventoryStatus() {
        return listingInventoryStatus;
    }

    public void setListingInventoryStatus(Short listingInventoryStatus) {
        this.listingInventoryStatus = listingInventoryStatus;
    }

    public Short getListingPricingStatus() {
        return listingPricingStatus;
    }

    public void setListingPricingStatus(Short listingPricingStatus) {
        this.listingPricingStatus = listingPricingStatus;
    }

    public Short getListingImageStatus() {
        return listingImageStatus;
    }

    public void setListingImageStatus(Short listingImageStatus) {
        this.listingImageStatus = listingImageStatus;
    }

    public Short getListingRelationshipStatus() {
        return listingRelationshipStatus;
    }

    public void setListingRelationshipStatus(Short listingRelationshipStatus) {
        this.listingRelationshipStatus = listingRelationshipStatus;
    }

    public Short getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(Short closeStatus) {
        this.closeStatus = closeStatus;
    }

    public Short getRefreshInventoryStatus() {
        return refreshInventoryStatus;
    }

    public void setRefreshInventoryStatus(Short refreshInventoryStatus) {
        this.refreshInventoryStatus = refreshInventoryStatus;
    }

    public Short getRefreshPricingStatus() {
        return refreshPricingStatus;
    }

    public void setRefreshPricingStatus(Short refreshPricingStatus) {
        this.refreshPricingStatus = refreshPricingStatus;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Short getFulfillmentLatency() {
        return fulfillmentLatency;
    }

    public void setFulfillmentLatency(Short fulfillmentLatency) {
        this.fulfillmentLatency = fulfillmentLatency;
    }

    @Override
    public String toString() {
        return "ListingTask{" +
                "id=" + id +
                ", merchantId=" + merchantId +
                ", productId=" + productId +
                ", skuId=" + skuId +
                ", skuCode='" + skuCode + '\'' +
                ", listingBaseinfoStatus=" + listingBaseinfoStatus +
                ", listingInventoryStatus=" + listingInventoryStatus +
                ", listingPricingStatus=" + listingPricingStatus +
                ", listingImageStatus=" + listingImageStatus +
                ", listingRelationshipStatus=" + listingRelationshipStatus +
                ", closeStatus=" + closeStatus +
                ", refreshInventoryStatus=" + refreshInventoryStatus +
                ", refreshPricingStatus=" + refreshPricingStatus +
                ", quantity=" + quantity +
                ", price=" + price +
                ", fulfillmentLatency=" + fulfillmentLatency +
                '}';
    }
}
