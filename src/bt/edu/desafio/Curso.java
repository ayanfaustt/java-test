package bt.edu.desafio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    @Override
    public Double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }



    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
