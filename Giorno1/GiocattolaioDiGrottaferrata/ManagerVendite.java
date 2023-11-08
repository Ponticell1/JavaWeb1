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
    public void autoVendita(String clienteLogin, String clientePassword, Cliente clienteTarget, Giocattolo giocattoloTarget) {
        if (clienteLogin.equals(clienteTarget.getEmail()) && clientePassword.equals(clienteTarget.getPassword())) {
            VenditaGiocattoli vendita = new VenditaGiocattoli(clienteTarget, giocattoloTarget);
            addVendita(vendita);
        } else {System.out.println("è possibile effettuare acquisti solamente per il proprio account");}
    }
    public void vendita(String nomeAdmin, String passswordAdmin, VenditaGiocattoli vendita){
        if (nomeAdmin.equals(this.nomeAdmin) && passswordAdmin.equals(this.passwordAdmin)) {
            addVendita(vendita);
        } else {System.out.println("Credenziali errate");}
    }
}
