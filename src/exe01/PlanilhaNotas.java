package exe01;

public class PlanilhaNotas {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.leitura();
        a1.calculaMedia();
        a1.apresenta();

        a2.leitura();
        a2.calculaMedia();
        a2.apresenta();
    }
}
