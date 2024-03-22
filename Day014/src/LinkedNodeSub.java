
public class LinkedNodeSub {

	   private String name;
	   private int kor;
	   private int eng;
	   private int mat;
	   private int total = kor+eng+mat;
	   
	   public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	LinkedNodeSub nexts;  //자기참조
	   
	
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
	}
