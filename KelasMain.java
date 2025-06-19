public class KelasMain {

  public static void main(String[] args) {
    KartuDebit kartu = new KartuDebit("888", "999", "123");
    MesinATM mesinATM = new MesinATM();
    mesinATM.init(kartu);
  }
}
