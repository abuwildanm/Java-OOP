package Interface;

public class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;
    
    public Invoice(String productName, Integer pricePerItem, Integer quantity) {
        this.productName = productName;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }
    
    @Override
    public int getPayableAmount() { return pricePerItem * quantity; }

    public String getProductName() { return productName; }
    public Integer getQuantity() { return quantity; }
    public Integer getPricePerItem() { return pricePerItem; }
}
