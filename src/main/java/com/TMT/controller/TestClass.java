package com.TMT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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
//        table.updadeRound(524, 20);
//        table.updadeRound(524, 21);
        table.updateDay(524, LocalDate.now().minusDays(1));

    }
}
