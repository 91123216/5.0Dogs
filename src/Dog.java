public class Dog
{
    private String Name;
    private int Age;
    private String Breed;
    private float Weight;
    private double weight;
    private static int dogCount;
    public Dog(String DogName, int DogAge, String DogBreed, float DogWeight)
    {
        this.Name = DogName;
        this.Age = DogAge;
        this.Breed = DogBreed;
        this.Weight = DogWeight;
        dogCount++;
    }

    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public String getBreed()
    {
        return Breed;
    }
    public double getWeight()
    {
        weight = Weight * 0.453592;
        return weight;
    }
    public static void getDogs()
    {
        System.out.println("I have " + dogCount + " dogs");
    }

    public String toString()
    {
        String outcome = "Name: " + Name + "\nAge: " + Age + "\nBreed: " + Breed + "\nWeight: " + getWeight();
        return outcome;
    }
} //End dog class