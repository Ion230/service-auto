package service_auto_ion.serviceion.common;


public class DieselMecanic implements Mecanicul {

    @Override
    public void reparaMasina() {
        System.out.println("Eu repar masini pe benzincik.");
    }
}
