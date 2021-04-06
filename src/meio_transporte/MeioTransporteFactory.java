package meio_transporte;

public class MeioTransporteFactory {
    public static MeioTransporte criarMeioTransporte(int numeroMeioTransporte) throws IllegalAccessException {
        if (numeroMeioTransporte == 1) {
            return new Pedestre();
        }

        if (numeroMeioTransporte == 2) {
            return new Carro();
        }

        if (numeroMeioTransporte == 3) {
            return new Onibus();
        }

        if (numeroMeioTransporte == 4) {
            return new Metro();
        }

        throw new IllegalAccessException("Número do meio transprote inválido");
    }
}
