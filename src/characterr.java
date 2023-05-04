public class characterr{
  String nama;
  int health;
  String weapon;
  int attackP;
  int mana;
  // membuat constructor
  characterr(String nama, int heal, String weapon, int attackP, int mana){ 
      this.nama = nama;
      this.health = health;
      this.weapon = weapon;
      this.attackP= attackP;
      this.mana = mana;
  }
  void attackP (){
      this.mana -= 5; 
      System.out.println(this.nama+" menyerang si sotong");
      // system.out.println("sotong terkena demage sebanyak "+this.attackP );

  }
  void demage(int attackP){
      System.out.println("ucup terkena demage sebanyak" + attackP);
      this.health -= attackP;
  }
  void print(){
      System.out.println("nama: "+ this.nama);  
      System.out.println("health: "+ this.health);
      System.out.println("weapon: "+ this.weapon);
      System.out.println("attackP: " + this.attackP);
      System.out.println("mana : " + this.mana);
  }

  public static void main(String[] args) {
      characterr character1 = new characterr("ucup",100,"pedang excalibur",5,100);
      character1.attackP();  
      character1.demage(10);
      character1.print();
  }
}
