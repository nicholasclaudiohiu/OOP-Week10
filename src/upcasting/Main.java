package upcasting;

public class Main {

	public static void main(String[] args) {
		
		Pekerja pekerja = new Pekerja();
		pekerja.tanyaIndentitas();
		
		//contoh upcasting
		pekerja = new CEO();
		pekerja.tanyaIndentitas();
		
		//contoh upcasting
		Karyawan karyawan = new Karyawan();
		pekerja = (Pekerja)karyawan;
		pekerja.tanyaIndentitas();
	}

}