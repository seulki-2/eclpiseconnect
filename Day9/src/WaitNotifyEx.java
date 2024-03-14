class ATMTwo implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {

				if (getDepositeMoney() <= 0)
					break;

				if (Thread.currentThread().getName().equals("mother")) {
					withDraw(1000);
					notify();
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					withDraw(1000);
					notify(); // 엄마 스레드를 깨움

					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("%d %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("End.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class WaitNotifyEx {
	public static void main(String[] args) {
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}