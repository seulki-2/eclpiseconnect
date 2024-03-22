public class StudentScoreHasA { //클래스 = 필드 + 메서드
   Name name;  //필드
   Subject kor;
   Subject eng;
   Subject mat; 
   int total;
   float avg;
    
    public StudentScoreHasA() { //메서드
        name = new Name();
        kor = new Subject();
        eng = new Subject();
        mat = new Subject();
    }
    
    public StudentScoreHasA(Name name, Subject kor, Subject eng, Subject mat) {
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng; 
    }
    
    public void setName(String name) {
        this.name.setName(name);
    }
    
    public void setKor(int kor) {
        this.kor.setSubject(kor);
    }
    
    public void setEng(int eng) {
        this.eng.setSubject(eng);
    }
    
    public void setMat(int mat) {
        this.mat.setSubject(mat);
    }
    
    public String getName() {
        return name.getName();
    }
    
    public int getKor() {
        return kor.getSubject(); 
    }
    
    public int getEng() {
        return eng.getSubject(); 
    }
    
    public int getMat() {
        return mat.getSubject();
    }
    
    // 합계 계산
    public int getTotal() {
 //      total = 
        return kor.getSubject() + eng.getSubject() + mat.getSubject();
    }
    
    // 평균 계산
    public float getAvg() {
        avg = (float) (kor.getSubject() + eng.getSubject() + mat.getSubject()) / 3;
        return avg;
    }
    
    public static void main(String[] args) {
        StudentScoreHasA stu = new StudentScoreHasA();
        stu.setName("superman");
        stu.setKor(90);
        stu.setMat(100);
        stu.setEng(70);
        
       System.out.println(stu.getName());
 	   System.out.println(stu.getKor());
 	   System.out.println(stu.getMat());
 	   System.out.println(stu.getEng());
 	   System.out.println(stu.getTotal());
 	   System.out.println(stu.getAvg());
    }
}