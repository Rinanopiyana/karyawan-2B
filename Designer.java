public class Designer extends Karyawan {
	public void tambahgaji(int tambahgaji){
		System.out.println("GAJI "+tambahgaji);
		if (tambahgaji<=gajiDes){
			tambahgaji+=tambahgaji;
			System.out.println("GAJI DITAMBAH:"+tambahgaji);
			System.out.println("GAJI ANDA:"+tambahgaji);
		}
		else {
			tambahgaji=gajiDes;
			System.out.println("GAJI MAXIMAL");
		}

	}


	public void tambahgaji(int tambahgaji, String pesan){
		if (tambahgaji<=gajiDes){
			tambahgaji+=tambahgaji;
			System.out.println("GAJI DITAMBAH:"+tambahgaji);
			System.out.println("GAJI ANDA:"+tambahgaji);
			System.out.println(pesan);
		}
		else {
			tambahgaji=gajiDes;
			System.out.println("GAJI MAXIMAL");
		}

	}
	

}
	
