package com.carmen.springboot.bill.springbootbill;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.carmen.springboot.bill.springbootbill.models.ItemBill;
import com.carmen.springboot.bill.springbootbill.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

      @Bean
      List<ItemBill> itemInvoice(){

            Product p1 = new Product("Auriculares", 900);
            Product p2 = new Product("TV Smart 32", 1800);
            return Arrays.asList(new ItemBill(p1,2),
                                 new ItemBill(p2,1));

      }

}
