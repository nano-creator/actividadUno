public class Coche {
    int puertas;
    public Coche(int puertas)
    {
    this.puertas = puertas;
    }
    public int incrementarPuertas()
    {
        puertas += 1;
        return this.puertas;
    }
}
