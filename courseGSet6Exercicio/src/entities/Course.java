package entities;

public class Course {

	private Integer userCod;

	public Course(Integer userCod) {
		this.userCod = userCod;
	}

	public Integer getUserCod() {
		return userCod;
	}

	public void setUserCod(Integer userCod) {
		this.userCod = userCod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userCod == null) ? 0 : userCod.hashCode());
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
		Course other = (Course) obj;
		if (userCod == null) {
			if (other.userCod != null)
				return false;
		} else if (!userCod.equals(other.userCod))
			return false;
		return true;
	}
	
}
