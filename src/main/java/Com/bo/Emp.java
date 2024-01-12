package Com.bo;

public class Emp 
{
	private int id;
	private String name;
	private String email;
	private int salary;
	private String desg;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Emp(String name, String email, int salary, String desg, String address) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.desg = desg;
		this.address = address;
	}
	@Override
	public String toString() 
	{
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", desg=" + desg
				+ ", address=" + address + "]";
	}
	

}
