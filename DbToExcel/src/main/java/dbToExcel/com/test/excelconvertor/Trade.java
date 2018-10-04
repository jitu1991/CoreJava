package dbToExcel.com.test.excelconvertor;

import java.sql.Date;
import java.sql.Time;

public class Trade {
	private int tradeId;
	
	public Trade() {
	}
	
	public Trade(int tradeId) {
		this.tradeId = tradeId;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tradeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		if (tradeId != other.tradeId)
			return false;
		return true;
	}

	
	
	/*@Override
	public boolean equals(Object obj) {
		Trade trade = (Trade) obj;
		return tradeId == trade.tradeId;
	}*/
}
