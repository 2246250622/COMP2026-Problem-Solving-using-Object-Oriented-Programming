//You are not allowed to modify this class

/**
 * A class that represents an employee in ABC company
 */
public class ABCEmployee {
	
	private String name;
	private int id;
	private String dept;
	private String position;
	
	public ABCEmployee(String name, int id, String dept, String position)
	{
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.position = position;
		
	}

	public ABCEmployee(String name, int id)
	{
		this(name, id, "", "");

	}

	public ABCEmployee()
	{
		this("", 0, "","");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

    @Override
    public String toString() {
        return "ABCEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
