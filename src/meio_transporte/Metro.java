package meio_transporte;

public class Metro implements MeioTransporte {

    @Override
    public void calcularRota() {
        System.out.println("Calculando rota para meio de transporte: Metro");
    }
}
