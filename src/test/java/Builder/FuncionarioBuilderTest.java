package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioBuilderTest {
    @Test
    void deveRetornarExcecaoParaAlunoSemMatricula() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Funcionario 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setId(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setId(1)
                .setNome("Funcionario 1")
                .build();

        assertNotNull(funcionario);
    }
}
