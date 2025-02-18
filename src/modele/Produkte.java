package modele;

public class Produkte {
    private String name;
    private int preis;
    private String Universum;

    public Produkte(String name, int preis, String Universum) {
        this.name = name;
        this.preis = preis;
        this.Universum = Universum;
    }

    public Produkte() {
        this.name = null;
        this.preis = 0;
        this.Universum = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getUniversum() {
        return Universum;
    }

    public void setUniversum(String Universum) {
        this.Universum = Universum;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", Universum='" + Universum + '\'' +
                '}';
    }
}
