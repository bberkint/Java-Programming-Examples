package overriding_Example;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager tarimKrediManager = new TarimKrediManager();
			
		BaseKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		
		BaseKrediManager ogrenciKrediManager = new OgrenciKrediManager();
		
		BaseKrediManager[] krediManager = new BaseKrediManager[]  {ogretmenKrediManager , tarimKrediManager , ogrenciKrediManager};
		
		for (BaseKrediManager baseKrediManager : krediManager) {
			System.err.println(baseKrediManager.hesapla(1000));
		}
	} 

}
