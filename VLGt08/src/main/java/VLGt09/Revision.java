package VLGt09;

import java.util.Calendar;
import java.util.Date;

public class Revision extends Paciente{

    Date ultimaRevision;

    public Revision(String nombre, Date fechaNacimiento, Date ultimaRevision) {
        super(nombre, fechaNacimiento);
        this.ultimaRevision = ultimaRevision;
    }

    public Date getUltimaRevision() {
        return ultimaRevision;
    }

    public void setUltimaRevision(Date ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    @Override
    public float facturar() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.setTime(super.getFechaNacimiento());
        int birthYear = cal.get(Calendar.YEAR);
        int age = currentYear - birthYear;
        if (age > 65) {
            return 30;
        }else return  50;
    }

}
