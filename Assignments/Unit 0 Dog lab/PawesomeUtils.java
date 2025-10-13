public class PawesomeUtils {

    public static String generateDogTag(int dogId, char dogChar) {
        return generateDogTag(dogId + dogChar, dogChar);
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + "has been picked up by their owner" + dog.getOwnerName() + ".";
        }
        return dog.getName() + "They can't leave yet, safety first!";
    }

    public static void checkIn(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(true);
            System.out.println("This dog is valid!!!");
        } else {
            System.out.println("This dog is invalid, it is a counterfeit dog");
        }
    }

    public static int validateDogId(int dogId) {
        String numDogId = String.valueOf(dogId);
        if (numDogId.length() == 3) {
            return dogId;
        } else {
            return (int) (Math.random() * 900 + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        String newDogTag2 = dog.getDogTag();
        String numDogTag2 = String.valueOf(newDogTag2);
        if (numDogTag2.length() == 4) {
            return true;
        } else {
            return false;
        }
        
    }

    public static char generateDogChar(Dog dog) {
        int dogId2 = dog.getDogId();
        char dogChar = dog.getDogChar();
        int dig3 = dogId2 % 10;
        int dig2 = dogId2 / 10 % 10;
        int dig1 = dogId2 / 100 % 10;
        dogChar = (char) ('F' + (dig1 + dig2 + dig3) % 10);
        return dogChar;
    }

    public static int convertToHumanAge(Dog dog) {
        int age = dog.getAge();
        if (age == 1) {
            return 15;
        } else if (age == 2) {
            return 24;
        } else {
            return 24 + ((age - 2) * age);
        }
        
    }

    public static int convertToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 15 && humanYears >= 24) {
            return 2;
        } else {
            return (int)((humanYears + 2) / humanYears) - 24;
            
        }
    }
}
