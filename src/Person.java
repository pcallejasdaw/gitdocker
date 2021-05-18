/**
 * <h2>UD3 and UD6 (Git and Docker)</h2>
 * <h3>Exercise number 4</h3>
 * Creating a javadoc
 * 
 * @author Pau Callejas Tudurí
 */
public class Person {

    /**
     * The person's name
     */
    public String name;

    /**
     * The person's surname
     */
    public String surname;
    
    /**
     * The person's full name
     */
    private final String fullName;

    /**
     * The person's actual position
     */
    private float position;
    
    /**
     * It create's the person object by taking the name and surname
     * as arguments
     * 
     * @param _name the person's name
     * @param _surname the person's surname
     */
    public Person(String _name, String _surname) {
        fullName = name + " " + surname;
        name = _name;
        surname = _surname;
    }
    
    /**
     * It changes the person position by calling the method "move"
     * with the distance passed by argument
     * 
     * @param _distance the distance added to the actual position
     */
    public void walk(float _distance) {
        position += move(_distance);
    }

    /**
     * It calculate the distance that the person will move
     * by taking the argument and multiply it by 1.0float
     * 
     * @param _distance distance to move
     * @return the distance that the person will move
     */
    protected float move(float _distance) {
        return _distance * 1.0f;
    }
    
    /**
     * It prints the message from the string passed as argument
     * 
     * @param _message message to print
     */
    public void speak(String _message) {
        System.out.println(createMessage(_message));
    }
    
    /**
    * It creates a message from the string passed as argument and the
    * person's information.
    *
    * @param _message message to include
    * @return created message
    */
    private String createMessage(String _message) {
        return fullName + " (" + position + "m): " + _message;
    }
}