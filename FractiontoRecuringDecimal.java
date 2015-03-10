public class FractiontoRecurringDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
	    
	    // use long type to avoid over flow
		long longNumerator = Math.abs((long) numerator);
		long longDenominator = Math.abs((long) denominator);

		StringBuilder sb = new StringBuilder();
		if ((long) numerator * denominator < 0) sb.append("-");
		sb.append(longNumerator / longDenominator);

		long remainder = longNumerator % longDenominator;
		
		// no fractional
		if (remainder == 0)
		    return sb.toString();
		sb.append(".");

		StringBuilder fracSb = new StringBuilder();
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		
		int index = 0;
		
		while (remainder != 0) {
			remainder *= 10;
			long nextRemainder = remainder % longDenominator;
			
			// If repeated part occurs.
			if (map.containsKey(remainder)) {
				fracSb.insert(map.get(remainder), "(");
				fracSb.append(")");
				break;
			}
			
			map.put(remainder, index++);
			fracSb.append(remainder / longDenominator);
			remainder = nextRemainder;
		}

		sb.append(fracSb);
		return sb.toString();
	}
}