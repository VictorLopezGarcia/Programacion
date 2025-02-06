package VLGt08;

import java.util.Date;

public final class CuentaPlazo extends CuentaCorriente{

    private Date fechaCreacion;

    CuentaPlazo(String iban) {
        super(iban, 0.0f);
        fechaCreacion = new Date(System.currentTimeMillis());
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public boolean retirar(float importe) {
        if(super.getSaldo() >= importe) {
            super.setSaldo(super.getSaldo()-importe);
            return true;
        } else {
            return false;
        }
    }
}
