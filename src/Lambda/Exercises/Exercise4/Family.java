package Lambda.Exercises.Exercise4;

public class Family implements FamilyFuncInterf2{

    @Override
    public String familyMembers2(int noOfChildren, int noOfPets, String name) {
        return "We are " + name + " family, and we have "
                + noOfChildren + " children and " + noOfPets + " pets.";
    }
}
