public class Karyawan{

	String nama;
	String alamat;
	private int gaji;

	int gajiDes=70;
	int gajiProg=90;
	int gajiPM=100;

public void tambahgaji(int tambahgaji){
	gaji+=tambahgaji;
	System.out.println("Gaji yang anda terima"+gaji);
}
public void tambahgaji(int tambahgaji, String pesan){
	gaji+=tambahgaji;
	System.out.println("Gaji yang anda terima"+gaji);
	System.out.println(pesan);

}
 	public void setnama(String addnama){
 		nama=addnama;
 }
 	public void setalamat(String addalamat){
 		alamat=addalamat;
 }
 	public String getnama(){
 		return nama;
 }
	 public String getalamat(){
    	return alamat;
 }


}