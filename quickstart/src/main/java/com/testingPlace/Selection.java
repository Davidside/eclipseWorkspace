package com.testingPlace;

import java.io.Serializable;

public class Selection implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String selection;

	public Selection() {
		super();
	}
	public Selection(String selection) {
		super();
		this.selection = selection;
	}

	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		builder.append("]");
		return builder.toString();
	}
}
