package com.xephir64.megatenapi.repository;

import com.xephir64.megatenapi.model.Demon;
import org.springframework.data.repository.CrudRepository;

public interface DemonsRepository extends CrudRepository<Demon, Long> {
}
