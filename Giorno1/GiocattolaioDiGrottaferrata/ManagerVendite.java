package Giorno1.GiocattolaioDiGrottaferrata;

public class ManagerVendite extends RegistroVendite{
    private static ManagerVendite instance;
    private final String nomeAdmin;
    private final String passwordAdmin;
    
    private ManagerVendite(String nomeAdmin, String passwordAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.passwordAdmin = passwordAdmin;
    }
    public static ManagerVendite getInstance(String nomeAdmin, String passwordAdmin) {
        if (instance == null) {
            instance = new ManagerVendite(nomeAdmin, passwordAdmin);
        }
        return instance;
    }
    public void autoVendita(String clienteLogin, String clientePassword, Cliente clienteTarget, Giocattolo giocattoloTarget, Inventario inventario) {
        if (clienteLogin.equals(clienteTarget.getEmail()) && clientePassword.equals(clienteTarget.getPassword())) {
            if(inventario.isGiocattoloPresent(giocattoloTarget)){
                VenditaGiocattoli vendita = new VenditaGiocattoli(clienteTarget, giocattoloTarget);
                addVendita(vendita);
            }
            else if (!inventario.isGiocattoloPresent(giocattoloTarget)) {
                System.out.println("Giocattolo non presente in inventario");
            }
        } else {System.out.println("è possibile effettuare acquisti solamente per il proprio account");}
    }
    public void vendita(String nomeAdmin, String passswordAdmin, VenditaGiocattoli vendita){
        if (nomeAdmin.equals(this.nomeAdmin) && passswordAdmin.equals(this.passwordAdmin)) {
            addVendita(vendita);
        } else {System.out.println("Credenziali errate");}
    }
}
