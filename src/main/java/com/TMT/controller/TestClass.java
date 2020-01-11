package com.TMT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestClass {

    private Table table;

    @Autowired
    public TestClass(Table table) {
        this.table = table;
    }

    @GetMapping
    public void dupa() {
        table.neccesaryMethod();
    }
}
