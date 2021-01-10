package pt.iade.reused.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.reused.models.Tipo;
import pt.iade.reused.repositories.TipoRepository;


@RestController                              // http://localhost:8080/api/invt  mvnw spring-boot:run
@RequestMapping(path = "/api/invt")
public class TipoController {
    private Logger logger = LoggerFactory.getLogger(TipoController.class);
    @Autowired
    private TipoRepository tipoRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public Iterable<Tipo> getTipos() {
    logger.info("Enviar todo o inventario");
        return tipoRepository.findAll();
    }
}   //poi