package lesson17;

import java.util.ArrayList;
public abstract class Team {
   private ArrayList<People> people = new ArrayList<>();
   private String name;

   public ArrayList<People> getPeople() {
      return people;
   }

   public void setPeople(People people) {
      this.people.add(people);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
