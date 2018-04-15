public class Nombre {
    private String clave;
    private Double balance;

    public Nombre(String clave,Double balance) {
        this.clave = clave;
        this.balance = balance;

    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
