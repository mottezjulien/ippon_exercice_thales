package fr.ippon.thales;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class VirtualMachineDTO {

    private String currencyCode;
    private Integer tierMinimumUnits;
    private Double retailPrice;
    private Double unitPrice;
    private String armRegionName;
    private String location;
    private LocalDate effectiveStartDate;
    private String meterId;
    private String meterName;
    private String productId;
    private String skuId;
    private String productName;
    private String skuName;
    private String serviceName;
    private String serviceId;
    private String serviceFamily;
    private String unitOfMeasure;
    private String type;

    @JsonProperty("isPrimaryMeterRegion")
    private Boolean isPrimaryMeterRegion;

    private String armSkuName;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getTierMinimumUnits() {
        return tierMinimumUnits;
    }

    public void setTierMinimumUnits(Integer tierMinimumUnits) {
        this.tierMinimumUnits = tierMinimumUnits;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getArmRegionName() {
        return armRegionName;
    }

    public void setArmRegionName(String armRegionName) {
        this.armRegionName = armRegionName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(LocalDate effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceFamily() {
        return serviceFamily;
    }

    public void setServiceFamily(String serviceFamily) {
        this.serviceFamily = serviceFamily;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPrimaryMeterRegion() {
        return isPrimaryMeterRegion;
    }

    public void setPrimaryMeterRegion(Boolean primaryMeterRegion) {
        isPrimaryMeterRegion = primaryMeterRegion;
    }

    public String getArmSkuName() {
        return armSkuName;
    }

    public void setArmSkuName(String armSkuName) {
        this.armSkuName = armSkuName;
    }
}
