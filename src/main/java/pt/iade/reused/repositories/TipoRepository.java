package pt.iade.reused.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.reused.models.Tipo;

public interface TipoRepository
extends CrudRepository<Tipo, Integer> {}