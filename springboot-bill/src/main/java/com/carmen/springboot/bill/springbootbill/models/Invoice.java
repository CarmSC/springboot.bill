package com.carmen.springboot.bill.springbootbill.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
      
      @Autowired
      private Client client;

      @Value("${invoice.description}")
      private String description;
      
      @Autowired
      private List<ItemBill> item;

      public Invoice() {
      }
      public Invoice(Client client, String description, List<ItemBill> item) {
            this.client = client;
            this.description = description;
            this.item = item;
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
            return item;
      }
      public void setItem(List<ItemBill> item) {
            this.item = item;
      }

}
