
import java.awt.*;

public class CheckBoxEx {

	public static void main(String[] args) {
		Frame f = new Frame("ButtonTest"); //프레임.
		Panel p = new Panel(); //패널. 컴포넌트의 세트
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox radio1 = new Checkbox("선택1",group, false); //group으로 묶어줘야 다중선택 방지
		Checkbox radio2 = new Checkbox("선택2",group, true); //처음에 true라고 입력한 항목이 선택 셋팅되어 있음
		Checkbox radio3 = new Checkbox("선택3",group, false);
		
		p.add(radio1);
		p.add(radio2);
		p.add(radio3);
		
		f.add(p); //패널을 프레임에 붙이기
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
	}

}
