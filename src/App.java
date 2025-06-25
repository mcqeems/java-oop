import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Paket> daftarPaket = List.of(
				new PaketBarang("JEX001", 5.5),
				new PaketDokumen("JEX002", 0.5),
				new PaketMakanan("JEX003", 2.1),
				new PaketDokumen("JEX004", 0.2));

		System.out.println("--- MEMULAI PEMROSESAN PAKET ---");

		for (Paket paketan : daftarPaket) {
			paketan.infoUmum();
			if (paketan instanceof PaketDokumen) {
				PaketDokumen paketDokumen = (PaketDokumen) paketan;
				paketDokumen.segelDenganAman();
			} else if (paketan instanceof PaketBarang) {
				PaketBarang paketBarang = (PaketBarang) paketan;
				paketBarang.lindungiDenganBubbleWrap();
			} else {
				PaketMakanan paketMakanan = (PaketMakanan) paketan;
				paketMakanan.masukkanKePendingin();
			}
			System.out.println("--------------------");
		}

		System.out.println("\n--- SEMUA PAKET TELAH DIPROSES ---");

	}
}

class Paket {
	String nomorResi;
	double beratKg;

	public Paket(String nomorResi, double beratKg) {
		this.nomorResi = nomorResi;
		this.beratKg = beratKg;
	}

	public void infoUmum() {
		System.out.println("No. Resi: " + this.nomorResi);
		System.out.println("Berat: " + this.beratKg + " kg");
	}
}

class PaketDokumen extends Paket {
	public PaketDokumen(String nomorResi, double beratKg) {
		super(nomorResi, beratKg);
	}

	public void segelDenganAman() {
		System.out.println("--> TINDAKAN: Paket disegel dengan stiker RAHASIA.");
	}
}

class PaketBarang extends Paket {
	public PaketBarang(String nomorResi, double beratKg) {
		super(nomorResi, beratKg);
	}

	public void lindungiDenganBubbleWrap() {
		System.out.println("--> TINDAKAN: Paket dibungkus dengan bubble wrap ekstra.");
	}
}

class PaketMakanan extends Paket {
	public PaketMakanan(String nomorResi, double beratKg) {
		super(nomorResi, beratKg);
	}

	public void masukkanKePendingin() {
		System.out.println("--> TINDAKAN: Paket dimasukkan ke dalam kotak pendingin.");
	}
}
