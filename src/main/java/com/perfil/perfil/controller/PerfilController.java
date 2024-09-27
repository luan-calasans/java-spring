package com.perfil.perfil.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.perfil.perfil.model.Perfil;

@RestController
@RequestMapping("/api/perfis")
public class PerfilController {

    private List<Perfil> perfis = new ArrayList<>();

    @PostMapping
    public Perfil criarPerfil(@RequestBody Perfil perfil) {
        perfil.setId((long) (perfis.size() + 1)); // Definindo ID baseado no tamanho da lista
        perfil.setDataCriacao(LocalDateTime.now()); // Definindo a data de criação
        perfis.add(perfil);
        return perfil;
    }

    @GetMapping
    public List<Perfil> obterTodosPerfis() {
        return perfis;
    }

    @GetMapping("/{id}")
    public Perfil obterPerfilPorId(@PathVariable Long id) {
        return perfis.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping(params = "dataCriacao")
    public List<Perfil> obterPerfisPorDataCriacao(@RequestParam String dataCriacao) {
        LocalDate date = LocalDate.parse(dataCriacao); // Parse da data recebida
        return perfis.stream()
                .filter(p -> p.getDataCriacao().toLocalDate().isEqual(date))
                .toList();
    }

    @PutMapping
    public Perfil atualizarPerfil(@RequestBody Perfil perfil) {
        for (int i = 0; i < perfis.size(); i++) {
            if (perfis.get(i).getId().equals(perfil.getId())) {
                perfil.setDataCriacao(perfis.get(i).getDataCriacao()); // Manter a data de criação
                perfis.set(i, perfil);
                return perfil;
            }
        }
        return null; // Retorna null se o perfil não for encontrado
    }

    @DeleteMapping("/{id}")
    public void excluirPerfil(@PathVariable Long id) {
        perfis.removeIf(p -> p.getId().equals(id));
    }
}
