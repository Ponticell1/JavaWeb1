package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.List;
import java.util.ArrayList;

public abstract class RegistroVendite {
    private List<VenditaGiocattoli> vendite = new ArrayList<>();

    public void addVendita(VenditaGiocattoli vendita) {
        vendite.add(vendita);
    }
    public void removeVendita(VenditaGiocattoli vendita) {
        vendite.remove(vendita);
    }
    public void autoAddVenditaGiocattoli(Cliente cliente, Giocattolo giocattoloVenduto) {
        VenditaGiocattoli vendita = new VenditaGiocattoli(cliente, giocattoloVenduto);
        vendite.add(vendita);
    }
    public void autoRemoveVendita(Cliente cliente, Giocattolo giocattolo){

    }
    public void stampaVendite() {
        for (VenditaGiocattoli vendita : vendite) {
            System.out.println(vendita);
        }
    }
    public void stampaVendite(Cliente cliente) {
        for (VenditaGiocattoli vendita : vendite) {
            if (vendita.getCliente().equals(cliente)) {
                System.out.println(vendita);
            }
        }
    }
}