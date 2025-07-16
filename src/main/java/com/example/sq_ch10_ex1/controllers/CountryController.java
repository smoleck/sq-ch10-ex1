package com.example.sq_ch10_ex1.controllers;

import com.example.sq_ch10_ex1.CountryDTO.Country;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
.header("continent"
                ,
                "Europe")
.header("capital"
                ,
                "Paris")
.header("favorite_food","cheese and wine")
.body(c);
    }
    @GetMapping("/italy")
    public Country italy() {
        Country c= Country.of("Italy", 60_000_000);
        return c;
    }
    @GetMapping("/germany")
    public Country germany() {
        Country c= Country.of("Germany", 83_000_000);
        return c;
    }
    @GetMapping("/spain")
    public Country spain() {
        Country c= Country.of("Spain", 47_000_000);
        return c;
    }
    @GetMapping("/portugal")
    public Country portugal() {
        Country c= Country.of("Portugal", 10_000_000);
        return c;
    }
    @GetMapping("/netherlands")
    public Country netherlands() {
        Country c= Country.of("Netherlands", 17_000_000);
        return c;
    }
    @GetMapping("/belgium")
    public Country belgium() {
        Country c= Country.of("Belgium", 11_000_000);
        return c;
    }
    @GetMapping("/switzerland")
    public Country switzerland() {
        Country c= Country.of("Switzerland", 8_000_000);
        return c;
    }
    @GetMapping("/austria")
    public Country austria() {
        Country c= Country.of("Austria", 9_000_000);
        return c;
    }
    @GetMapping("/poland")
    public Country poland() {
        Country c= Country.of("Poland", 38_000_000);
        return c;
    }
    @GetMapping("/sweden")
    public Country sweden() {
        Country c= Country.of("Sweden", 10_000_000);
        return c;
    }
    @GetMapping("/norway")
    public Country norway() {
        Country c= Country.of("Norway", 5_000_000);
        return c;
    }
    @GetMapping("/ukraine")
    public Country ukraine() {
        Country c= Country.of("Ukraine", 41_000_000);
        return c;
    }


    }



