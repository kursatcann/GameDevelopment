
public class Doctor {

	private String name ="";
	private String speciality="";
	private Phone phone =null;
	
	public Doctor(String name,String speciality,Phone phone)
	{
		this.name=name;
		this.speciality=speciality;
		this.phone=phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public String Display() {
		
		return name + speciality + phone.Display();
	}
			
}
