package com.ranjeet.demo.repository;

import com.ranjeet.demo.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StocksRepository extends JpaRepository<Stocks,Integer> {

    @Query("SELECT t FROM Stocks t WHERE t.stockQuote = ?1")
    Stocks findStocks(String stockQuote);

}


