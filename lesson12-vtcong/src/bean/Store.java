package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {
	private Long storeId;
	private Long referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private Boolean isSelected;
	private BigDecimal allowcationKey;
	private BigDecimal amountAllocated;

	public Store() {

	}

	public Store(final Long storeId, final Long referenceStoreId, final BigDecimal stockPreviousDay,
			final BigDecimal expectedSales, final Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(final Long storeId) {
		this.storeId = storeId;
	}

	public Long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(final Long referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(final BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(final BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public Boolean getSelected() {
		return isSelected;
	}

	public void setSelected(final Boolean selected) {
		isSelected = selected;
	}

	public BigDecimal getAllowcationKey() {
		return allowcationKey;
	}

	public void setAllowcationKey(BigDecimal allowcationKey) {
		this.allowcationKey = allowcationKey;
	}
	
	public BigDecimal getAmountAllocated() {
		return amountAllocated;
	}

	public void setAmountAllocated(BigDecimal amountAllocated) {
		this.amountAllocated = amountAllocated;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		final Store store = (Store) o;

		return getStoreId().equals(store.getStoreId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(storeId);
	}

	@Override
	public String toString() {
		return "";
//	        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
//	                .append("storeId", storeId)
//	                .append("referenceStoreId", referenceStoreId)
//	                .append("storePreviousDay", storePreviousDay)
//	                .append("expectedSales", expectedSales)
//	                .append("isSelected", isSelected)
//	                .toString();
	}	

}
