class Vet 
{
    public void giveShot(Animal a)
    {
        // do horrible things to the Animal at
        // the other end of the 'a' parameter
        a.makeNoise();
    }    
}

class PetOwner
{
    public void start()
    {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        vet.giveShot(dog);
        vet.giveShot(hippo);
    }
}
