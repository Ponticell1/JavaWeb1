package Giorno1.GiocattolaioDiGrottaferrata;

public class Cliente {
    private static int counter = 0;
    private int id;
    private String nome;
    private String email;
    private String password;
    
        public Cliente(String nome, String email, String password) {
            this.id = ++counter;
            this.nome = nome;
            this.email = email;
            this.password = password;
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
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        protected String getPassword() {
            return password;
        }
        @Override
        public String toString() {
            return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
        }
        
    }
