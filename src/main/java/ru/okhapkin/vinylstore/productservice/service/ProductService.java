package ru.okhapkin.vinylstore.productservice.service;

import org.springframework.stereotype.Service;
import ru.okhapkin.vinylstore.productservice.dto.VinylDTO;
import ru.okhapkin.vinylstore.productservice.model.Vinyl;
import ru.okhapkin.vinylstore.productservice.repository.VinylRepository;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


@Service
public class ProductService {

    private static final Logger logger = Logger.getLogger(ProductService.class.getName());

    private final VinylRepository vinylRepository;

    public ProductService(VinylRepository vinylRepository) {
        this.vinylRepository = vinylRepository;
    }

    public void saveNewVinyl(VinylDTO vinylDTO) {
        Vinyl product = new Vinyl(
                UUID.randomUUID().toString(),
                vinylDTO.name(),
                vinylDTO.description(),
                vinylDTO.price(),
                vinylDTO.countOfDiscs(),
                vinylDTO.musician(),
                vinylDTO.label(),
                vinylDTO.listOfSongs()
        );

        vinylRepository.save(product);
        logger.info(String.format("Saved product '%s' with id '%s'", product.getName(), product.getId()));
    }

    public List<Vinyl> getAllVinyl() {
        return (List<Vinyl>) vinylRepository.findAll();
    }

}
