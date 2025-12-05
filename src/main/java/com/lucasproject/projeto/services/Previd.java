package com.lucasproject.projeto.services;


import org.springframework.stereotype.Service;

@Service
public class Previd {

    public double previdence(double amount){
        return amount * 0.1;
    }
}
