public class StuInfo {

	private int no, kor, eng, mat;
	private String name;
	private int sum;
	private float avg;
	
	public StuInfo() {
		this.name = "0";
		this.no = 0;
		this.kor = 0;
		this.mat = 0;
		this.eng = 0; 
		this.sum = 0;
		this.avg = 0.f;
	}

	public StuInfo(String name, int no, int kor, int eng, int mat, int sum, float avg) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng; 
		this.sum = kor + mat + eng;
		this.avg = this.sum/3.f;
	}

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

	public int getSum() {
		return (kor+eng+mat);
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return (kor+eng+mat)/3.f;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

}