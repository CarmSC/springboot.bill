package com.carmen.springboot.bill.springbootbill.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carmen.springboot.bill.springbootbill.models.Client;
import com.carmen.springboot.bill.springbootbill.models.Invoice;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

      @Autowired
      private Invoice invoice;

      @GetMapping("/showInvoice")
      public Invoice show(){
            return invoice;
      }

}
