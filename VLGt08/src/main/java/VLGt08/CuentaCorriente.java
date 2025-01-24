package VLGt08;

import java.util.Date;

public class CuentaCorriente {
    public String iban;
    private float saldo;
    private int contadorIngresos;
    private float porcentajeComision;
    

CuentaCorriente (String iban, float porcentajeComision) {
    this.iban = iban; 
    this.saldo = 0;
    this.porcentajeComision = porcentajeComision;
    this.contadorIngresos = 0;
}    
public void setComision (float porcentajeComision) {
    this.porcentajeComision = porcentajeComision;
}
public float getComision () {return porcentajeComision;}
public float        getSaldo ()              {return (saldo);}
public void         setSaldo (float saldo)   {this.saldo = saldo;}


    //Por cada 3 ingresos consecutivos, se añadirá un bonus de 0.7€ al saldo.
public void ingresar (float importe) {
    float bonus=0;
    if (++contadorIngresos == 3) {
       contadorIngresos = 0; 
       bonus =0.7f;
    }    
    saldo += importe + bonus;
}
    //calcula el dinero a retirar despues de comisiones y de no ser posible devuelve false.
public boolean retirar (float importe) {
    float comision = porcentajeComision * importe;
    if (importe + comision <= saldo) {
       saldo -= importe+comision;  //resta (importe+comision)
       contadorIngresos = 0;
       return true;
    }
    else return false; 
}
}

class CuentaPlazo extends CuentaCorriente{

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
