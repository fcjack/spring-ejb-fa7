package br.fa7.trabalho.resource;

import br.fa7.trabalho.entity.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 4/25/16.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
