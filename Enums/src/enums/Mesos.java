package enums;

public enum Mesos {
    GEN("gener", 31, "Hivern"),
    FEB("febrer", 28, "Hivern"),
    MAR("març", 31, "Hivern"),
    ABR("abril", 30, "Primavera"),
    MAI("maig", 31, "Primavera"),
    JUN("juny", 30, "Primavera"),
    JUL("juliol", 31, "Estiu"),
    AGO("agost", 31, "Estiu"),
    SET("setembre", 30, "Estiu"),
    OCT("octubre", 31, "Tardor"),
    NOV("novembre", 30, "Tardor"),
    DES("desembre", 31, "Tardor");

    private final String mes;
    private final int dia;
    private final String seasonCat;

    private Mesos(String mes, int dia, String seasonCat) {
        this.mes = mes;
        this.dia = dia;
        this.seasonCat = seasonCat;
    }

    public String getMes() {
        return this.mes;
    }

    public int getDia() {
        return this.dia;
    }

    public String getSeasonCat() {
        return this.seasonCat;
    }
}