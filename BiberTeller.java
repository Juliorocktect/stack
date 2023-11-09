public class BiberTeller {
  private static Stack<Teller> teller;
  private static Queue<Biber> biber;

  public static boolean istPassend() {
    Queue<Biber> biber_tmp = biber;
    Stack<Teller> teller_tmp = teller;
    while (!biber.isEmpty()) {
      if (biber.front().getSize() != teller.top().getSize()) {
        biber = biber_tmp;
        teller = teller_tmp;
        return false;
      } else {
        biber.dequeue();
        teller.pop();
      }
    }
    biber = biber_tmp;
    teller = teller_tmp;
    return true;
  }

  public static void main(String[] args) {
    teller = new Stack<>();
    biber = new Queue<>();
    // teller.push(new Teller(0));
    // biber.enqueue(new Biber(1));
    teller.push(new Teller(1));
    biber.enqueue(new Biber(1));
    System.out.println(istPassend());
  }
}
