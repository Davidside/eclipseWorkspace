package com.testingPlace;

import java.io.Serializable;
import java.util.Date;

public class Selection implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String selection;
	private EnumInterface enumInterface;
	private Date dateFrom;
	private Date dateTo;

	public Selection() {
		super();
	}

	public Selection(String selection, EnumInterface enumInterface, Date dateFrom, Date dateTo) {
		super();
		this.selection = selection;
		this.enumInterface = enumInterface;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public String getSelection() {
		return selection;
	}
	
	public void setSelection(String selection) {
		this.selection = selection;
	}
	
	public EnumInterface getEnumInterface() {
		return enumInterface;
	}
	
	public void setEnumInterface(EnumInterface enumInterface) {
		this.enumInterface = enumInterface;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((enumInterface == null) ? 0 : enumInterface.hashCode());
		result = prime * result + ((selection == null) ? 0 : selection.hashCode());
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
		Selection other = (Selection) obj;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (enumInterface != other.enumInterface)
			return false;
		if (selection == null) {
			if (other.selection != null)
				return false;
		} else if (!selection.equals(other.selection))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Selection [selection=");
		builder.append(selection);
		builder.append(", enumInterface=");
		builder.append(enumInterface);
		builder.append(", dateFrom=");
		builder.append(dateFrom);
		builder.append(", dateTo=");
		builder.append(dateTo);
		builder.append("]");
		return builder.toString();
	}
}