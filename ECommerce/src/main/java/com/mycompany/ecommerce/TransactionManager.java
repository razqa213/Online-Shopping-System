package com.mycompany.ecommerce;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TransactionManager {
    private Map<String, Set<product2>> transactionMap;

    public TransactionManager() {
        transactionMap = new HashMap<>();
    }

    public void addPurchase(String customerName, product2 product) {
        transactionMap.putIfAbsent(customerName, new HashSet<>());
        transactionMap.get(customerName).add(product);
    }

    public Set<product2> getCustomerPurchases(String customerName) {
        return transactionMap.getOrDefault(customerName, new HashSet<>());
    }

    public Map<String, Set<product2>> getAllTransactions() {
        return transactionMap;
    }
}
