public class MobilRemoteControl {
  
    private boolean mesinOn;
    private int kecepatan;
    private int arah;
    
    // konstruktor untuk menginisialisasi atribut
    public MobilRemoteControl() {
      mesinOn = false;
      kecepatan = 0;
      arah = 0;
    }
    
    // method untuk menyalakan mesin mobil
    public void nyalakanMesin() {
      mesinOn = true;
      System.out.println("Mesin mobil dinyalakan.");
    }
    
    // method untuk mematikan mesin mobil
    public void matikanMesin() {
      mesinOn = false;
      kecepatan = 0;
      arah = 0;
      System.out.println("Mesin mobil dimatikan.");
    }
    
    // method untuk mengatur kecepatan mobil
    public void aturKecepatan(int kecepatanBaru) {
      if (mesinOn) {
        kecepatan = kecepatanBaru;
        System.out.println("Kecepatan mobil diatur menjadi " + kecepatanBaru + " km/jam.");
      } else {
        System.out.println("Mesin mobil belum dinyalakan.");
      }
    }
    
    // method untuk mengatur arah mobil
    public void aturArah(int arahBaru) {
      if (mesinOn) {
        arah = arahBaru;
        System.out.println("Arah mobil diatur menjadi " + arahBaru + " derajat.");
      } else {
        System.out.println("Mesin mobil belum dinyalakan.");
      }
    }
    
    // method untuk menggerakkan mobil sesuai dengan kecepatan dan arah
    public void gerak() {
      if (mesinOn) {
        double x = kecepatan * Math.cos(Math.toRadians(arah));
        double y = kecepatan * Math.sin(Math.toRadians(arah));
        System.out.println("Mobil bergerak sejauh (" + x + ", " + y + ").");
      } else {
        System.out.println("Mesin mobil belum dinyalakan.");
      }
    }
    
    public static void main(String[] args) {
      MobilRemoteControl mobil = new MobilRemoteControl();
      
      mobil.nyalakanMesin();
      mobil.aturKecepatan(50);
      mobil.aturArah(45);
      mobil.gerak();
      
      mobil.aturKecepatan(70);
      mobil.aturArah(-30);
      mobil.gerak();
      
      mobil.matikanMesin();
    }
  }
  