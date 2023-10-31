package market.ark.api.cliente;

import market.ark.api.endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String data_de_nascimento, String telefone, DadosEndereco endereco) {}