package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.Date;

public class VenditaGiocattoli {
    private Cliente cliente;
    private Giocattolo giocattoloVenduto;
    private Date dataVendita;
    
    public VenditaGiocattoli(Cliente cliente, Giocattolo giocattoloVenduto, Date dataVendita) {
        this.cliente = cliente;
        this.giocattoloVenduto = giocattoloVenduto;
        this.dataVendita = dataVendita;
    }
    public VenditaGiocattoli(Cliente cliente, Giocattolo giocattoloVenduto) {
        this.cliente = cliente;
        this.giocattoloVenduto = giocattoloVenduto;
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
