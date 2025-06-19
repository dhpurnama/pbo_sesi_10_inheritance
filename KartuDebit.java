public class KartuDebit {
  private String kodeBank;
  private String noRekening;
  private String pin;
  private boolean valid;

  public KartuDebit(String kodeBank, String noRekening, String pin) {
    super();
    this.kodeBank = kodeBank;
    this.noRekening = noRekening;
    this.pin = pin;
    this.valid = true;
  }

  public String getKodeBank() {
    return kodeBank;
  }

  public String getNoRekening() {
    return noRekening;
  }

  public String getPin() {
    return pin;
  }

  public boolean isValid() {
    return valid;
  }
}
