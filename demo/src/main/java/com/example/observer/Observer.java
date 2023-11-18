package com.example.observer;

import com.example.model.Estoque;

public interface Observer {

    void update(Estoque estoque);
}