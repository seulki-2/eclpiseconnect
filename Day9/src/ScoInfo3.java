import java.util.Objects;
public class ScoInfo3 {

	private int no, kor, eng, mat;
	private String name;
	private int sum;
	private float avg;
	
	public ScoInfo3() {
		this.name = "0";
		this.no = 0;
		this.kor = 0;
		this.mat = 0;
		this.eng = 0; 
		this.sum = 0;
		this.avg = 0.f;
	}

	public ScoInfo3(String name, int no, int kor, int eng, int mat) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng; 
		this.sum = kor + mat + eng;
		this.avg = (kor + mat + eng)/3.f;
	}
//	 @Override
//	    public boolean equals(Object obj) {
//	        if (this == obj) return true;
//	        if (obj == null || getClass() != obj.getClass()) return false;
//	        ScoInfo2 scoInfo2 = (ScoInfo2) obj;
//	        return no == scoInfo2.no 
//	                &&Objects.equals(name, scoInfo2.name)
//	                &&eng == scoInfo2.eng
//	                &&kor == scoInfo2.kor
//	                &&mat == scoInfo2.mat
//	        		;
//	    }
//
//	    @Override
//	    public int hashCode() {
//	        return Objects.hash(no, name, kor, eng, mat);
//	    }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

}