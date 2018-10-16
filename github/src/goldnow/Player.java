package goldnow;


public class Player {

	/**
	 * 
	 */
	// create variables
	private int id;
	private int roundNo;
	private String firstName;
	private String lastName;
	private String country;
	private String position;
	private Object score;
	private Object strokes;
	
	// create getters and setters for variables
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
		System.out.println("PlayerID: " +id);
	}
	/**
	 * @return the roundNo
	 */
	public Integer getRoundNo() {
		return roundNo;
	}
	/**
	 * @param roundNo the roundNo to set
	 */
	public void setRoundNo(Integer roundNo) {
		this.roundNo = roundNo;
		System.out.println("Round Number: " +roundNo);
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("First Name: " +firstName);
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("Last Name: " +lastName);
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
		System.out.println("Country: " +country);
		
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
	
			this.position = position;
			System.out.println("Poisition: " +position);
	
	}
	/**
	 * @return the score
	 */
	public Object getScore() {
		
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(Object score) {
		this.score = score;
		System.out.println("Score: " +score);
	}
	/**
	 * @return the strokes
	 */
	public Object getStrokes() {
		return strokes;
	}
	/**
	 * @param strokes the strokes to set
	 */
	public void setStrokes(Object strokes) {
		this.strokes = strokes;
		System.out.println("Strokes: " +strokes);
	}
	
	
	

}
