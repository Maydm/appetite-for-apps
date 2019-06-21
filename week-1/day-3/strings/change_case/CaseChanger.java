public class CaseChanger {
    public static void main(String[] args) {
        String question = "WHY ARE YOU YELLING?";
        String answer = "I'm not yelling";

        System.out.println(question.toLowerCase());
        System.out.println(answer.toUpperCase());
        System.out.println(question); // Is this still lowercase or is it uppercase now?
    }
}