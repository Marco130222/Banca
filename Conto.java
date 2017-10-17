public class Conto {

    public String iban, cf;
    public double saldo;

    public class Conto (
    String iban, String
    cf)

    {
        this.iban = iban;
        this.cf = cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean prelievo(double a) {
        if (a >= 0 && a <= saldo) {
            saldo -= a;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(double a) {
        if (a >= 0) {
            saldo += a;
            return true;
        } else {
            return false;
        }
    }

    String getIban() {
        return iban;
    }
}


