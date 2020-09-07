package com.ranjeet.demo.service;

import com.ranjeet.demo.model.Stocks;
import com.ranjeet.demo.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StocksServImpl implements  StocksService{

    @Autowired
    StocksRepository stocksRepository;

    @Override
    public Stocks save(Stocks stocks) {
        return stocksRepository.save(stocks);
    }

    @Override
    public Stocks findStocks(String stockQuote) {
        Stocks stocks=stocksRepository.findStocks(stockQuote);
        if(stocks!=null){
            return stocks;
        }
        return null;
    }

}
