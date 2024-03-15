
import java.awt.*;

public class CardLayoutEx extends Frame {
	CardLayout card;
	Panel first_panel, second_panel, third_panel;

	public CardLayoutEx() {
		super("Card Layout"); //프레임의 타이틀명정하기. super.
		card = new CardLayout();

		setLayout(card);

		first_panel = new Panel();
		first_panel.add(new Button("1"));
		first_panel.add(new Button("2"));

		second_panel = new Panel();
		second_panel.add(new Button("3"));
		second_panel.add(new Button("4"));

		third_panel = new Panel();
		third_panel.add(new Button("5"));
		third_panel.add(new Button("6"));

		add("1", first_panel);
		add("2", second_panel);
		add("3", third_panel);

	}

	public void rotate() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

			card.next(this);
			;
		}
	}

	public static void main(String[] args) {
		CardLayoutEx clt = new CardLayoutEx();

		clt.setBounds(200, 200, 200, 100);
		clt.setVisible(true);

		clt.rotate();
	}
}