package market.ark.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

//receber ou devolver da nossa api DTO
public record DadosEndereco(
        @NotBlank
        String rua,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String estado,
        @Pattern(regexp = "\\d{8}")
        String cep) {
}



