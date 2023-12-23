package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Demon;
import com.xephir64.megatenapi.repository.DemonRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Data
@Service
public class DemonService {
    private DemonRepository demonRepository;
    @Autowired
    public void setDemonRepository(DemonRepository demonRepository) {
        this.demonRepository = demonRepository;
    }
    /**
     * Get a demon by id
     * @param id The id of the demon
     * @return The demon
     */
    public Optional<Demon> getDemon(final Long id) {
        return demonRepository.findById(id);
    }
    /**
     * Get a demon by name
     * @param name The name of the demon
     * @return The demon if exists
     */
    public Demon getDemon(final String name) {
        AtomicReference<Demon> dem = new AtomicReference<>();
        this.getAllDemons().forEach(demon -> {
            if(demon.getName().equals(name)) {
                dem.set(demon);
            }
        });
        return dem.get();
    }
    /**
     * Get a list of demons starting by
     * @param contains The starting letters
     * @return A demon list
     */
    public Iterable<Demon> getDemonsByLetter(final String contains) {
        ArrayList<Demon> demons = new ArrayList<>();
        this.getAllDemons().forEach(demon -> {
            if(demon.getName().contains(contains)) {
                demons.add(demon);
            }
        });
        return demons;
    }
    /**
     * Get all demons
     * @return All demons
     */
    public Iterable<Demon> getAllDemons() {
        return demonRepository.findAll();
    }

    public void deleteDemon(final Long id) {
        demonRepository.deleteById(id);
    }

    public Demon saveDemon(Demon demon) {
        return demonRepository.save(demon);
    }
}
