package com.carmen.springboot.bill.springbootbill.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
      
      @Autowired
      private Client client;

      @Value("${invoice.description.office}")
      private String description;
      
      @Autowired
      @Qualifier("default")
      private List<ItemBill> items;

      public Invoice() {
      }
      public Invoice(Client client, String description, List<ItemBill> items) {
            this.client = client;
            this.description = description;
            this.items = items;
      }
      public Client getClient() {
            return client;
      }
      public void setClient(Client client) {
            this.client = client;
      }
      public String getDescription() {
            return description;
      }
      public void setDescription(String description) {
            this.description = description;
      }
      public List<ItemBill> getItem() {
            return items;
      }
      public void setItem(List<ItemBill> items) {
            this.items = items;
      }

      public int getTotal() {
            return items.stream()
            .map(item -> item.getImporte())
            .reduce(0, (sum, importe) -> sum + importe);
        }

}
