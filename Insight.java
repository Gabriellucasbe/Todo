package Todo;

public class Insight {
    private static int contadorId = 0;
    private int id;

    public Insight(String titulo) {
        this.id = contadorId++;
    }
}
