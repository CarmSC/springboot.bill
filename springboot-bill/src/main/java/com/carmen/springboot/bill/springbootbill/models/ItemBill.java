package com.carmen.springboot.bill.springbootbill.models;

public class ItemBill {

      private Product product;
      private Integer quantity;
      
      public ItemBill() {
      }
      public ItemBill(Product product, Integer quantity) {
            this.product = product;
            this.quantity = quantity;
      }
      public Product getProduct() {
            return product;
      }
      public void setProduct(Product product) {
            this.product = product;
      }
      public Integer getQuantity() {
            return quantity;
      }
      public void setQuantity(Integer quantity) {
            this.quantity = quantity;
      }
      public int getImporte() {
            return quantity * product.getPrice();
        }

}
