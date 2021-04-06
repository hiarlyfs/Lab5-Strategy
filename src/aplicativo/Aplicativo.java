package aplicativo;

import meio_transporte.MeioTransporte;
import meio_transporte.MeioTransporteFactory;

public class Aplicativo {
    private MeioTransporte meioTransporte;

    public void alterarMeioTransporte(int numeroMeioTransporte) throws IllegalAccessException {
        meioTransporte = MeioTransporteFactory.criarMeioTransporte(numeroMeioTransporte);
        meioTransporte.calcularRota();
    }

}
