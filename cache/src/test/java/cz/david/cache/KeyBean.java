package cz.david.cache;

import java.util.Arrays;
import java.util.Map;

public class KeyBean {

	private InnerBean innerBean;

	public KeyBean(InnerBean innerBean) {
		super();
		this.innerBean = innerBean;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((innerBean == null) ? 0 : innerBean.hashCode());
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
		KeyBean other = (KeyBean) obj;
		if (innerBean == null) {
			if (other.innerBean != null)
				return false;
		} else if (!innerBean.equals(other.innerBean))
			return false;
		return true;
	}




}