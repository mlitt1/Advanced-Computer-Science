public class AnagramListTester {
    public static void main(String[] args) {
        Word ihwak = new Word("ihwak");
        Word hkawi = new Word("hkawi");
        Word lebron = new Word("Lebron");
        Word kawhi = new Word("Kawhi");
        Word racecar = new Word("Racecar");
        AnagramList list = new AnagramList();
        list.add(racecar);
        list.add(kawhi);
        list.add(lebron);
        list.add(hkawi);
        list.add(ihwak);
        System.out.println(list.searchAnagrams("Kawhi"));
    }
}
