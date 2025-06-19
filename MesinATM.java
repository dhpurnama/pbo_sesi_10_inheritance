import java.util.Scanner;

public class MesinATM {
  private KartuDebit kartuDebit;
  private boolean valid;

  public void init(KartuDebit kartuDebit) {
    if (kartuDebit.isValid()) {
      this.kartuDebit = kartuDebit;
      valid = true;
      System.out.println("Mbsukkan no. PIN");

      Scanner scan = new Scanner(System.in);
      String pinlnput = scan.next();
      if (otentikasi(pinlnput) == true) {
        System.out.println("Menu Utama");
      } else {
        System.out.println("NO PIN tidak sesuai...");
      }
    } else System.out.println("Kartu Debit tidak valid...");
  }

  private boolean otentikasi(String pinlnput) {
    if (valid) {
      if (kartuDebit.getPin().equalsIgnoreCase(pinlnput)) return true;
      else return false;
    }
    return false;
  }
}
