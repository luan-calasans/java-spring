package com.perfil.perfil.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.perfil.perfil.model.Perfil; // Import necessário

public class PerfilRepository {
    private List<Perfil> perfis = new ArrayList<>();
    private Long idCounter = 1L;

    public Perfil save(Perfil perfil) {
        if (perfil.getId() == null) {
            perfil.setId(idCounter++);
        }
        perfis.removeIf(p -> p.getId().equals(perfil.getId())); // Remove o perfil existente
        perfis.add(perfil);
        return perfil;
    }

    public List<Perfil> findAll() {
        return new ArrayList<>(perfis);
    }

    public Optional<Perfil> findById(Long id) {
        return perfis.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void deleteById(Long id) {
        perfis.removeIf(p -> p.getId().equals(id));
    }

    public List<Perfil> findByDataCriacao(LocalDateTime dataCriacao) {
        return perfis.stream()
                .filter(p -> p.getDataCriacao().toLocalDate().isEqual(dataCriacao.toLocalDate()))
                .collect(Collectors.toList());
    }
}
