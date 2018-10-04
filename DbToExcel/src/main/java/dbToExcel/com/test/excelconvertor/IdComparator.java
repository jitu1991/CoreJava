package dbToExcel.com.test.excelconvertor;

import java.util.Comparator;

public class IdComparator implements Comparator<Trade>{

	@Override
	public int compare(Trade o1, Trade o2) {
		return o1.getTradeId() - o2.getTradeId();
	}
}
