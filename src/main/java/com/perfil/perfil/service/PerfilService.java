package com.perfil.perfil.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.perfil.perfil.model.Perfil;
import com.perfil.perfil.repository.PerfilRepository;

@Service
public class PerfilService {

    private final PerfilRepository perfilRepository = new PerfilRepository();

    public Perfil criarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public List<Perfil> obterTodosPerfis() {
        return perfilRepository.findAll();
    }

    public Optional<Perfil> obterPerfilPorId(Long id) {
        return perfilRepository.findById(id);
    }

    public List<Perfil> obterPerfisPorDataCriacao(LocalDateTime dataCriacao) {
        return perfilRepository.findByDataCriacao(dataCriacao);
    }

    public Perfil atualizarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public void excluirPerfil(Long id) {
        perfilRepository.deleteById(id);
    }
}
