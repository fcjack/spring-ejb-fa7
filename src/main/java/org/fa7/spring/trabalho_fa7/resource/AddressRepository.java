package org.fa7.spring.trabalho_fa7.resource;

import org.fa7.spring.trabalho_fa7.entity.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 4/25/16.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
