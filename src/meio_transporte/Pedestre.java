package meio_transporte;

public class Pedestre implements MeioTransporte {

    @Override
    public void calcularRota() {
        System.out.println("Calculando rota para meio de transporte: Pedestre");
    }
}
