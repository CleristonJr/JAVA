public class metodos {
    public double somar(int num1, int num2){ //sempre que o método tem o tipo, ele retorna algo
        return num1 + num2;
    }

    public void imprimir(String texto){ //se não tem o tipo não precisa de return

    }

    public double dividir(int dividendo, int divisor) throws Exception{ // throws indica que o método ao ser utilizado pode gerar uma exceção
        return dividendo / divisor;
    }

    private void metodoPrivado(){ //este método não pode ser visto por outras classes no projeto
        int num3 = 0;
    }
}
