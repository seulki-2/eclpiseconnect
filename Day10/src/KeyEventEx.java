
import java.awt.*; //GUI만드는 패키지 import 
import java.awt.event.*; //AWT 이벤트 패키지 import

public class KeyEventEx extends Frame implements ActionListener{ //AdapterEX 클래스 구현. Frame 상속, ActionLister 인터페이스
	
	Panel p1, p2, p3; //p1,p2,p3 패널값
	TextField tf; //텍스트필드
	TextArea ta; //텍스트 영역
	Button b1, b2; // 두개의 버튼 객체
	
	public KeyEventEx(){ //KeyEventEx 클래스의 생성자를 정의함

		super("Adapter Exam"); //부모클래스 호출해서 제목 설정
		
		p1=new Panel(); //패널 객체 생성 
		p2=new Panel();
		p3=new Panel();

		tf=new TextField(35); //텍스트필드 객체 생성
		ta=new TextArea(10,35); //텍스트영역 객체 생성
	
		b1=new Button("Clear");
		b2=new Button("Exit");
		
		p1.add(tf);
		p2.add(ta);
		p3.add(b1);
		p3.add(b2);

		add("North",p1);
		add("Center",p2);
		add("South",p3);
		
		setBounds(300,200,300,300);
		setVisible(true);
		
		b1.addActionListener(this); //버튼에 액션리스너 등록
		b2.addActionListener(this); 
	
		
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					ta.append(tf.getText()+"\n");
					tf.setText("");
				}
			}//텍스트 필드에 키 이벤트 핸들러 등록
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); //윈도우 이벤트 헨들러 등록
	}
		}
		}
	}
			
	
	public void actionPerformed(ActionEvent e){ //버튼 이벤트 처리
		String str=e.getActionCommand();
		if(str.equals("Clear")){
			ta.setText("");
			tf.setText("");
			tf.requestFocus(); 
		}
		else if(str.equals("Exit")){
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		new KeyEventEx();
	}
		}
	}
}

//member



//
//class KeyEventHandler extends KeyAdapter{ //키어뎁터 상속받음
//	TextField tf;
//	TextArea ta;
//
//	public KeyEventHandler(TextField tf, TextArea ta){
//		this.tf=tf;
//		this.ta=ta;
//	}
//
//	public void keyTyped(KeyEvent e){ //키 입력에 대한 이벤트 처리 위한 메소드
//		if(e.getKeyChar() == KeyEvent.VK_ENTER){
//			ta.append(tf.getText()+"\n");
//			tf.setText("");
//		}
//	}	
//}
//annonyinnerclass
//class WindowEventHandler extends WindowAdapter{ //클래스 정의. window adpter 상속받음
//	public void windowClosing(WindowEvent e){
//		System.exit(0);
//	}
//}