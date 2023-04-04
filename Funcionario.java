package exercicio1;


public class Funcionario {
    int cracha;
    float salario;
    String cargo;

    Funcionario() {

    }

    Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }

    public float calculaAumento() {
        return  100 * 150 / salario;
    }

    public float calculaAumento(int tempo) {
        salario += 150 * tempo;
        return salario;
    }
}
