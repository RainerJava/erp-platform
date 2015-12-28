package com.speedycomm.erp.bd.facade.Info;

import com.speedycomm.erp.bd.core.Currency;

import java.util.UUID;

/**
 * Created by linjietao on 2015/12/24.
 */
public class CurrencyInfo {

    private String id;
    private String name;
    private String number;
    private String simpleName;
    private String description;
    private String symbol;
    private boolean enabled;

    public CurrencyInfo() {
        this.id = UUID.randomUUID().toString();
    }

    public CurrencyInfo(Currency currency) {
        this.id = currency.getId();
        this.name = currency.getName();
        this.number = currency.getNumber();
        this.simpleName = currency.getSimpleName();
        this.symbol = currency.getSymbol();
        this.description = currency.getDescription();
        this.enabled = currency.isEnabled();
    }

    public CurrencyInfo(String name, String number, String symbol) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.number = number;
        this.symbol = symbol;
        this.enabled = true;
    }

    public CurrencyInfo(String id, String name, String number, String simpleName, String symbol, String description, boolean enabled) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.simpleName = simpleName;
        this.symbol = symbol;
        this.description = description;
        this.enabled = enabled;
    }

    public Currency toEntity() {
        Currency currency = new Currency();
        currency.setId(this.id);
        currency.setName(this.name);
        currency.setNumber(this.number);
        currency.setSimpleName(this.simpleName);
        currency.setSymbol(this.symbol);
        currency.setDescription(this.description);
        currency.setEnabled(this.enabled);
        return currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
