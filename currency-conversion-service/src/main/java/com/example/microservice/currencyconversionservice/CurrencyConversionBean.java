package com.example.microservice.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long       id;
    private String     from;
    private String     to;
    private BigDecimal conversionMultiple;
    private BigDecimal quanity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(final Long id, final String from, final String to, final BigDecimal conversionMultiple, final BigDecimal quanity,
            final BigDecimal totalCalculatedAmount, final int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quanity = quanity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(final String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(final BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuanity() {
        return quanity;
    }

    public void setQuanity(final BigDecimal quanity) {
        this.quanity = quanity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(final BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }
}
