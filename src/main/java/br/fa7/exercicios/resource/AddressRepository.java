package br.fa7.exercicios.resource;

import br.fa7.exercicios.entity.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 4/25/16.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
