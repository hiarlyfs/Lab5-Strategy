package meio_transporte;

import meio_transporte.MeioTransporte;

public class Carro implements MeioTransporte {

    @Override
    public void calcularRota() {
        System.out.println("Calculando rota para meio de transporte: Carro");
    }
}
