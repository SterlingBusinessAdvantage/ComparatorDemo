import java.util.Date;
import java.util.GregorianCalendar;

class Person implements Comparable{
	private String firstName;
	private String lastName;
    private Date birthday;
    
    Person(String firstName,String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
    public String getLastName() {
		return lastName;
	}

    public String getFullName() {
    	return firstName + " " + lastName;
    }

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


    public double getAge(){
    	//GregorianCalendar gc = new GregorianCalendar(birthday.getYear(),birthday.getDay(),birthday.getMonth());
    	return birthday.getDate();
    }

    @Override
    public String toString() {
        return String.format("{name=%s, age=%d}", getFullName(), getAge());
    }
    public int compareTo(Object other){
    	if (! (other instanceof Person) )
    		throw new IllegalArgumentException("Parameter must be a Person!");
    	
    		Person somebodyElse = (Person)other;
    	    int cmp = lastName.compareTo(somebodyElse.lastName);
    	    if (cmp != 0) {
    	      return cmp;
    	    }
    	    cmp = firstName.compareTo(somebodyElse.firstName);
    	    if (cmp != 0) {
    	      return cmp;
    	    }
    	    return Double.compare(this.birthday, somebodyElse.birthday);
    	  }

    }
    
    public int compareTo(double age) {
    	  
    	  double p1 = this.getAge();
    	  double p2 = age;

    	  if (p1 > p2 ){
    	   return 1;
    	  }
    	  else if (p1 < p2){
    	   return -1;
    	  }
    	  else
    	   return 0;
    	 }
    
    public int compareTo(Date birthday) {
  	  
  	  Date p1 = this.getBirthday();
  	  Date p2 = birthday;

  	  if (p1 > p2 ){
  	   return 1;
  	  }
  	  else if (p1 < p2){
  	   return -1;
  	  }
  	  else
  	   return 0;
  	 }
    
    public int compareTo(String lastName) {
  	  
  	  String p1 = this.getLastName();
  	  String p2 = lastName;

  	  if (p1 > p2 ){
  	   return 1;
  	  }
  	  else if (p1 < p2){
  	   return -1;
  	  }
  	  else
  	   return 0;
  	 }
}