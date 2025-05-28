package ru.okhapkin.vinylstore.productservice.dto;

import java.math.BigDecimal;

public record VinylDTO (
        String name,
        String musician,
        String label,
        String description,
        BigDecimal price,
        Integer countOfDiscs,
        String listOfSongs
) {}
