public class PhraseOMatic 
{
    public static void main(String[] args)
    {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "stringly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asychronous", "event driven", "pub-sub", "IoT", "cloud", "native", "service oriented", "containerized", "serverless", "microservices", "listributed ledger"};
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service", "mest", "architecture", "perspective", "design", "orientation"};

        // find out the length of each word list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        // print the phrase on the console
        System.out.println("What we need is a " + phrase);  
    } // end main method
} // end class
