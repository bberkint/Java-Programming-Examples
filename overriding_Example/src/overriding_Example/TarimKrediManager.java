package overriding_Example;

public class TarimKrediManager extends BaseKrediManager{
	
	@Override
	public double hesapla(double tutar) {
		// TODO Auto-generated method stub
		return tutar*1.19;
	}
	
}
