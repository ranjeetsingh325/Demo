package com.ranjeet.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Stocks")
public class Stocks {


        @Id
        private int id;

        private String stockQuote;

        private String companyName;

        private Date date;

        private String price;

        private String currency;


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getStockQuote() {
                return stockQuote;
        }

        public void setStockQuote(String stockQuote) {
                this.stockQuote = stockQuote;
        }

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }

        public String getPrice() {
                return price;
        }

        public void setPrice(String price) {
                this.price = price;
        }

        public String getCurrency() {
                return currency;
        }

        public void setCurrency(String currency) {
                this.currency = currency;
        }



}

