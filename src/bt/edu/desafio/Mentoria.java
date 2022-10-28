package bt.edu.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
