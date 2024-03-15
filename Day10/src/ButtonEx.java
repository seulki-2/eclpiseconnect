
import java.awt.*;

public class ButtonEx {

	public static void main(String[] args) {
		Frame f = new Frame("ButtonTest"); //프레임.
		Panel p = new Panel(); //패널. 컴포넌트의 세트
		
		Button b1 = new Button(); 
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		
		b1.setLabel("1"); //버튼명은 setLabel을 통해 추후 입력 가능
		
		p.add(b1); //패널에 b1~b4붙이기
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p); //패널을 프레임에 붙이기
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
	}

}
