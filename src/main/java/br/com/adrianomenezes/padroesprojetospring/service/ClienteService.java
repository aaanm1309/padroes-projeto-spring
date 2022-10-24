package br.com.adrianomenezes.padroesprojetospring.service;

import br.com.adrianomenezes.padroesprojetospring.entity.Cliente;


public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
