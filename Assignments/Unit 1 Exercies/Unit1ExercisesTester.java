public class Unit1ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit1Exercises.helloName("Bob"));
        System.out.println(Unit1Exercises.helloName("Alice"));
        System.out.println(Unit1Exercises.helloName("X"));

        System.out.println(Unit1Exercises.makeOutWord("[[]]", "Owen"));
        System.out.println(Unit1Exercises.makeOutWord("<<>>", "Jane"));
        System.out.println(Unit1Exercises.makeOutWord("<<>>", "Matt"));

        System.out.println(Unit1Exercises.withoutEnd("Owen"));
        System.out.println(Unit1Exercises.withoutEnd("Justinyu"));
        System.out.println(Unit1Exercises.withoutEnd("Ryanchen"));

        System.out.println(Unit1Exercises.comboString("dogs", "crocodiles"));
        System.out.println(Unit1Exercises.comboString("Owen", "Justin"));
        System.out.println(Unit1Exercises.comboString("James", "cool"));

        System.out.println(Unit1Exercises.left2("cool"));
        System.out.println(Unit1Exercises.left2("James"));
        System.out.println(Unit1Exercises.left2("MrMedovoy"));

        System.out.println(Unit1Exercises.middleThree("Barfing"));
        System.out.println(Unit1Exercises.middleThree("OwenFua"));
        System.out.println(Unit1Exercises.middleThree("JamesEsser"));

        System.out.println(Unit1Exercises.withoutEnd("Ohbrother"));
        System.out.println(Unit1Exercises.withoutEnd("Classplaylist"));
        System.out.println(Unit1Exercises.withoutEnd("Harrypottertrapremix"));

        System.out.println(Unit1Exercises.stringEnds("MrLopez", 3));
        System.out.println(Unit1Exercises.stringEnds("Iscool", 2));
        System.out.println(Unit1Exercises.stringEnds("Awesomesauce", 4));

        System.out.println(Unit1Exercises.hasBad("xxBadxx"));
        System.out.println(Unit1Exercises.hasBad("xBadxxx"));
        System.out.println(Unit1Exercises.hasBad("Badxxxx"));
        
        System.out.println(Unit1Exercises.countVowels("Hello"));
        System.out.println(Unit1Exercises.countVowels("abc"));
        System.out.println(Unit1Exercises.countVowels(""));

        System.out.println(Unit1Exercises.countCode("codexxcode"));
        System.out.println(Unit1Exercises.countCode("aaacodebbb"));
        System.out.println(Unit1Exercises.countCode("cozexxcope"));
    }
}
