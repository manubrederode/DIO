// Classe DataCenter contém uma lista de salas

import java.util.List;

public class DataCenter {

    private List<Sala> salas;

    public DataCenter(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Sala> getSalas() {
        return salas;
    }

}
