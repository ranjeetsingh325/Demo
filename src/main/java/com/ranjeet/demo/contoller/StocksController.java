package com.ranjeet.demo.contoller;

import com.ranjeet.demo.model.Stocks;
import com.ranjeet.demo.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class StocksController {

    @Autowired
    StocksService stocksService;

    @RequestMapping(value = "/stockQuote",method = RequestMethod.POST)
    public Stocks save(@RequestBody Stocks stocks){
        return stocksService.save(stocks);
    }

    @RequestMapping(value = "/stockQuote",method = RequestMethod.GET)
    public ResponseEntity<Stocks> fetchStocks(@RequestParam String stockQuote){

        Stocks stocks= stocksService.findStocks(stockQuote);
        if (stocks==null){
          return  ResponseEntity.notFound().build();
        }else {
           return  ResponseEntity.ok().body(stocks);
        }
    }

}
