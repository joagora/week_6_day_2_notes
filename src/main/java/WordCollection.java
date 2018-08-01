public class WordCollection {

    //basic arrays. We create an array of strings. It is an empty array:
    private String[] words;
    public WordCollection(){
        //we initialize the class with an array of strings with 5 elements. We have a costructor for arrays as in Ruby we had Array.new
        this.words = new String[5];
        //this will give us [null, null, null, null, null]

    }
    public int getWordCount(){
        //length is a property not a method so it doesn't need ()
        return this.words.length;

    }
    //add a word to the array
    public void add(String word){
        this.words[0] = word;
        //arrays are not used in java for the most part
    }
}
