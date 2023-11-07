package Giorno1.GiocattolaioDiGrottaferrata;
public class Giocattolo{
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(int id, String nome, double prezzo, int etaConsigliata) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }
    
    
}