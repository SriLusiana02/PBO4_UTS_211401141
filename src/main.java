package src;

public class Character {
  private String nama;
  private int health;
  private String weapon;
  private int attackPower;
  private int mana;

  // membuat constructor
  public Character(String nama, int health, String weapon, int attackPower, int mana) {
    this.nama = nama;
    this.health = health;
    this.weapon = weapon;
    this.attackPower = attackPower;
    this.mana = mana;
    print();
  }

  public void attack() {
    this.mana -= 5;
    System.out.println(this.nama + " menyerang musuh");
    System.out.println("Musuh terkena damage sebanyak " + this.attackPower);
  }

  public void damage(int attackPower) {
    System.out.println(this.nama + " terkena damage sebanyak " + attackPower);
    this.health -= attackPower;
  }

  public void print() {
    System.out.println("Nama: " + nama);
    System.out.println("Health: " + health);
    System.out.println("Weapon: " + weapon);
    System.out.println("Attack Power: " + attackPower);
    System.out.println("Mana: " + mana);
  }

  public static void main(String[] args) {
    Character character1 = new Character("Ucup", 100, "Pedang Excalibur", 5, 100);
    character1.attack();
    character1.damage(10);
    character1.print();
  }
}
