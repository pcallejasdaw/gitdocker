public class Person {

    public String name;
    public String surname;
    
    private final String fullName;
    private float position;
    
    public Person(String _name, String _surname) {
        fullName = name + " " + surname;
        name = _name;
        surname = _surname;
    }
    
    public void walk(float _distance) {
        position += move(_distance);
    }

    protected float move(float _distance) {
        return _distance * 1.0f;
    }
    
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