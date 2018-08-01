import java.util.ArrayList;

public class NumberList {
    //Integer with capital I refers to a high-level type
    private ArrayList<Integer> numbers;

    //this is the constructor
    public NumberList(ArrayList<Integer> listOfNumbers){
        this.numbers = listOfNumbers;
    }

    public int getNumberCount(){
        return this.numbers.size();
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }

    //Given an index return the element at that index
    public int getNumberAtIndex(int index){
        return this.numbers.get(index);
    }

    //loop over all elements in ArrayList and add each of them
    public int getTotal(){

        //make a new variable for total
        int total = 0;
        //write for loop to calculate total
        for (int i = 0; i < getNumberCount(); i++){
            total += getNumberAtIndex(i);
        }
        //return total
        return total;
    }

//    public int getEnhancedTotal(){
//        int total = 0;
//        //its the same as for number in numbers in Ruby
//        for (int number: this.numbers){
//            total += number;
//        }
//        return total;
//    }






}

//arrayLists vs arrays -> arraylists are dynamically sized