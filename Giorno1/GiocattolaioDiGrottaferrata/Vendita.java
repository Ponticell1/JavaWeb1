package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.Date;

public class Vendita {
    private Cliente cliente;
    private Giocattolo giocattoloVenduto;
    private Date dataVendita;
    
    public Vendita(Cliente cliente, Giocattolo giocattoloVenduto, Date dataVendita) {
        this.cliente = cliente;
        this.giocattoloVenduto = giocattoloVenduto;
        this.dataVendita = dataVendita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Giocattolo getGiocattoloVenduto() {
        return giocattoloVenduto;
    }

    public Date getDataVendita() {
        return dataVendita;
    }

    @Override
    public String toString() {
        return "Articolo venduto: " + giocattoloVenduto.getNome() + " a " + cliente.getNome()+ " id: "+ cliente.getId() + " il " + dataVendita + "\n";
    }
}
