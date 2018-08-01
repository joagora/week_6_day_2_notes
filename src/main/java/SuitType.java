public enum SuitType {
    //frequently enums hold Type in their name. It is finite. It is also a constant
    //we can assign value to enums if there is a hirarchy between them
    //sometimes we also want to get some message with them or some value
    SPADE(3, "Spades"),
    HEART(2, "Hearts"),
    DIAMOND(1, "Diamonds"),
    //we need a colon after the last enum
    CLUB(0, "Clubs");

    //we are indicating that it will never change
    private final int value;
    private final String name;
    //constructor for enum
    SuitType(int value, String name){
        this.value = value;
        this.name = name;
    }
    //uppercase is used for const

    public int getValue(){
        return this.value;
    }
}
