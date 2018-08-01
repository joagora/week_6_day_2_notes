import java.util.ArrayList;

public class River {
//creating array list holding salmon that is called school
    private ArrayList<Salmon> school;
    public River(){
        //we can give it Salmon here but its not needed
        school = new ArrayList<Salmon>();
    }

    public int salmonCount(){
        return this.school.size();
    }

    //the capital Salmon is the type(name of the class of the object), the salmon with lower case is a banana, a place holder

    public void addFish(Salmon salmon){
        this.school.add(salmon);
    }

    public Salmon removeFish(){
        //we need to type return to get the value to remove method and actually return it because java doesn't implicitly return stuff
        return this.school.remove(0);
    }
}
