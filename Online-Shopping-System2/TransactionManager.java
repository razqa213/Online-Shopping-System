import java.util.*;

public class TransactionManager {
    private Map<String, Set<product2>> transactionMap;

    public TransactionManager() {
        transactionMap = new HashMap();
    }

    public void addPurchase(String customerName, product2 product) {
        transactionMap.putIfAbsent(customerName, new HashSet<>());
        transactionMap.get(customerName) .add(product);

    }

    public Set<product2> getCustomerPurchases(String customerName) {
        return transactionMap.getOrDefault(customerName, new HashSet<>());
    }
}
