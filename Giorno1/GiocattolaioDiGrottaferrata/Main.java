package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner inputDetector= new Scanner(System.in);
    static ArrayList<Cliente> clienti = new ArrayList<>();
    static final String nomeAdmin = "admin";
    static final String passwordAdmin = "admin";
    static Inventario inventario = Inventario.getInstance(nomeAdmin, passwordAdmin);
    static ManagerVendite managerVendite = ManagerVendite.getInstance(nomeAdmin, passwordAdmin);
    static Cliente admin=new Cliente(nomeAdmin, "", passwordAdmin);
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario", "","1");
        Cliente c2 = new Cliente("Stefano", "","2");
        clienti.add(c1);
        clienti.add(c2);
        Giocattolo g1 = new Giocattolo("Pallone", 10, 5);
        Giocattolo g2 = new Giocattolo("Macchinina", 20, 3);
        
        inventario.addGiocattolo(nomeAdmin, passwordAdmin , g1);
        inventario.addGiocattolo(nomeAdmin, passwordAdmin , g2);
        System.out.println("Benvenuto nel negozio di giocattoli di Grottaferrata:");
        login();

    }
    private static boolean isClientePresent(String nomeUtente, String password){
        for (Cliente cliente : clienti) {
            if (cliente.getNome().equals(nomeUtente) && cliente.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    private static Cliente getCliente(String nomeUtente, String password){
        for (Cliente cliente : clienti) {
            if (cliente.getNome().equals(nomeUtente) && cliente.getPassword().equals(password)) {
                return cliente;
            }
        }
        return null;
    }
    public static void login(){
        System.out.println("Inserisci nome utente:");
        String nomeUtente = inputDetector.nextLine();
        System.out.println("Inserisci password:");
        String password = inputDetector.nextLine();
        if (isClientePresent(nomeUtente, password)){
            System.out.println("Login effettuato");
            drawMenu(getCliente(nomeUtente, password));
            nomeUtente="";
            password="";
        }
        else{
            System.out.println("Credenziali errate");
            nomeUtente="";
            password="";
            login();
        }
    }
    public static void drawMenu(Cliente cliente){
        System.out.println("+-----------------------+");
        System.out.println("1) Acquista giocattolo");
        System.out.println("2) Stampa giocattoli disponibili");
        System.out.println("3) Stampa storico acquisti");
        System.out.println("4) Logout");
        int choice = inputDetector.nextInt();
        inputDetector.nextLine();
        switch (choice) {
            case 1:
                acquistaGiocattolo(cliente);
                
                drawMenu(cliente);
                break;
            case 2:
                inventario.stampaGiocattoli();
                drawMenu(cliente);
                break;
            case 3:
                //System.out.println("huh?");
                stampaStoricoAcquisti(cliente);
                drawMenu(cliente);
                //TODO: stampa storico acquisti
                break;
            case 4:
                System.out.println("Logout effettuato");
                login();
                break;
            default:
                System.out.println("Scelta non valida");
                drawMenu(cliente);
                break;
        }
    }
    public static void acquistaGiocattolo(Cliente cliente){
        System.out.println("Giocattoli disponibili:");
        inventario.stampaGiocattoli();
        System.out.println("+-----------------------+");
        System.out.println("Inserisci nome giocattolo:");
        String nomeGiocattolo = inputDetector.next();
        Giocattolo gTarget=inventario.fetchGiocattolo(nomeGiocattolo);
        managerVendite.autoVendita(cliente.getEmail(), cliente.getPassword(), cliente, gTarget, inventario);
    }
    public static void stampaStoricoAcquisti(Cliente cliente){
        managerVendite.stampaVendite(cliente);
    }

}