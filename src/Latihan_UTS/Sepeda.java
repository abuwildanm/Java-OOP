/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_UTS;

/**
 *
 * @author AWe Em
 */
public class Sepeda {
    private int kecepatan, gir;
	public Sepeda(){
		kecepatan = 0;
		gir = 0;
}
	public Sepeda(int kecepatan, int gir){
		this.kecepatan = kecepatan;
		this.gir = gir;
	}
	public void ubahGir(int pertambahanGir){
		gir = gir + pertambahanGir;
		System.out.println("Gir : " + gir);
	}
	public void tambahKecepatan(int pertambahanKecepatan){
		kecepatan = kecepatan + pertambahanKecepatan;
		System.out.println("Kecepatan : " + kecepatan); 
}

}
