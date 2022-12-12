public class Main
{
    public static void main(String[] args)
    {
        Dog Fang = new Dog("Fang", 5, "Husky", 80);
        Dog Piper = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog Dale = new Dog("Dale", 10, "Bulldog", 30);
        System.out.println("Fang's Breed: " + Fang.getBreed());
        System.out.println("Fang's Age: " + Fang.getAge());
        System.out.println("Piper's Weight: " + Piper.getWeight());
        System.out.println(Dale.toString());
        Dog.getDogs();
    }
} //End main class