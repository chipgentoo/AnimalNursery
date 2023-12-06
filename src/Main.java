import Model.Pet;
import Services.IRepository;
import Services.PetRepository;

public class Main {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
    }
}
