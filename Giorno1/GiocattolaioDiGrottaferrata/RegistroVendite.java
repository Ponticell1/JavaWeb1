package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.List;
import java.util.ArrayList;

public abstract class RegistroVendite {
    private List<Vendita> vendite = new ArrayList<>();

    public void addVendita(Vendita vendita) {
        vendite.add(vendita);
    }
    public void removeVendita(Vendita vendita) {
        vendite.remove(vendita);
    }
}