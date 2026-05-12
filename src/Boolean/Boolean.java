package Boolean;

public class Boolean {
	// 9
	
			boolean areEquals(int a, int b){
			    boolean erg = a == b;
			    return erg;
			}
			

		//10
			
			boolean istGerade(int a)
			{
			    boolean erg = a % 2 == 0;
				return erg;
			}
			
		//11
			
			boolean istNegativ(int zahl)
			{
			    return zahl < 0;
			}
			
			
			
			boolean istPositiv(int zahl)
			{
			    return zahl > 0;
			}

		//12
			
			String prufeGleich(int a, int b)
			{
			    if (a == b)
			    {
			        return "gleich";
			    }

			    return "Pech";
			}
			
		//13
			
			boolean istGroesserAlsHundert(int zahl)
			{
			    return zahl > 100;
			}
		}


