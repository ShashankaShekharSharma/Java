public class file5 {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(addExclamation(s.toUpperCase()));
        System.out.println(addExclamation(s.toLowerCase()));
        System.out.println(s.length()); //returns the length of the string
    }
    public static String addExclamation(String a) {
        return (a + "!");
    }
}