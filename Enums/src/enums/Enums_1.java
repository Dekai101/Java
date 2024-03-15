package enums;

public class Enums_1 {


    public static void recorregutSeason() {
        for (Season s : Season.values()) {
            System.out.println(s.name());
        }
    }
    
  public static void recorregutMes() {
        for (Mesos m : Mesos.values()) {
            System.out.print(m.name());
            System.out.print(m.getMes());
            System.out.print(m.getDia());
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        recorregutMes();
    }
}
