
import java.awt.*;

public class TextFieldEx {

	public static void main(String[] args) {
		Frame f = new Frame("TextFieldEx"); //프레임.
		Panel p = new Panel(); //패널. 컴포넌트의 세트
		
		TextField tf1 = new TextField("name input: ",12); 
		TextField tf2 = new TextField("password input: ",10);
		
		tf1.selectAll();
		tf2.selectAll();
		
		tf2.setEchoChar('*'); //tf2에 넣은것은 *로 표출
			
		p.add(tf1);
		p.add(tf2);

		f.add(p); //패널을 프레임에 붙이기
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
	}

}
