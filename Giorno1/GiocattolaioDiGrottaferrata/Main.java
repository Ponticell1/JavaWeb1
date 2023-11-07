package Giorno1.GiocattolaioDiGrottaferrata;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario", "");
        Cliente c2 = new Cliente("Luigi", "");
        Cliente c3 = new Cliente("Wario", "");
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(c3.getId());
        Giocattolo g1 = new Giocattolo("Pallone", 10, 5);
        Giocattolo g2 = new Giocattolo("Macchinina", 20, 3);
        System.out.println(g1.getId());
        System.out.println(g2.getId());
    }
}