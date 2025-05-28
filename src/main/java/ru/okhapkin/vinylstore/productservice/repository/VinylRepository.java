package ru.okhapkin.vinylstore.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.okhapkin.vinylstore.productservice.model.Vinyl;

public interface VinylRepository extends CrudRepository<Vinyl, String> {
}
