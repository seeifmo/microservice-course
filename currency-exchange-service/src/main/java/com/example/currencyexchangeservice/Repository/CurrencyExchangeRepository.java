package com.example.currencyexchangeservice.Repository;

import com.example.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
    CurrencyExchange findByFromAndTo(String from, String to);
}
