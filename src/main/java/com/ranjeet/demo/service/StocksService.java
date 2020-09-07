package com.ranjeet.demo.service;

import com.ranjeet.demo.model.Stocks;

public interface StocksService {
    Stocks save(Stocks stocks);

    Stocks findStocks(String stockQuote);
}
