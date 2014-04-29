package TestBeans;

public class PersonBean implements java.io.Serializable{
	private String name = null;
	private boolean deceased = false;
	public PersonBean() {
	}
	 
	public String getName() {
		return name;
	}
	 
	    /**
	     * Setter for property <code>name</code>.
	     * @param value
	     */
	public void setName(final String value) {
		name = value;
	}
	 
	    /**
	     * Getter for property "deceased"
	     * Different syntax for a boolean field (is vs. get)
	     */
	public boolean isDeceased() {
		return deceased;
	}
	
	public void setDeceased(final Boolean bDeceased) {
		deceased = bDeceased;
	}

}