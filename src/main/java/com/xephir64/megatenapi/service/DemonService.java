package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Demon;
import com.xephir64.megatenapi.repository.DemonsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class DemonsService {
    @Autowired
    private DemonsRepository demonsRepository;

    public Optional<Demon> getDemon(final Long id) {
        return demonsRepository.findById(id);
    }

    public Optional<Demon> getDemon(final String name) {
        //return demonsRepository
        return null;
    }

    public Iterable<Demon> getAllDemons() {
        return demonsRepository.findAll();
    }

    public void deleteDemon(final Long id) {
        demonsRepository.deleteById(id);
    }

    public Demon saveDemon(Demon demon) {
        return demonsRepository.save(demon);
    }
}
