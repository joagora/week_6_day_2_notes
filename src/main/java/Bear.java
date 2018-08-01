import java.util.ArrayList;

public class Bear {
        private String name;
        private ArrayList<Salmon> belly;
        public Bear(String name){
            //we are passing the Salmon class as type in ArrayList, we need to initialize the arraylist first
            this.belly = new ArrayList<Salmon>();
            this.name = name;
        }

        public int foodCount() {
            return this.belly.size();
        }

        public void eatFish(Salmon salmon){
            belly.add(salmon);
        }

        public void sleep(){
            belly.clear();
        }
        //we pass in river because the bear goes to a river to take fish, so we need to know what river
        public void eatFishFromRiver(River river){
            //remove fish
            Salmon removedFish = river.removeFish();
            //add fish to bear
            belly.add(removedFish);
        }




}
