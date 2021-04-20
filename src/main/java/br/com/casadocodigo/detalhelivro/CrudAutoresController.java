package br.com.casadocodigo.detalhelivro;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
public class CrudAutoresController {

    @PersistenceContext
    private EntityManager manager;

    @PostMapping("/api/autor")
    @Transactional
    public void novo(@Valid @RequestBody NovoAutorForm form) {
        Autor novoAutor = form.novoAutor();
        manager.persist(novoAutor);
    }
}
