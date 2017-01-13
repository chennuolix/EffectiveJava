package Equals;

/**
 * Created by leixun on 16/9/8.
 */
public class EqualsString {
    public static void main(String[] args) {
        String string = "PubLish";
        CaseInsenstiveString caseInsenstiveString = new CaseInsenstiveString("publish");
        CaseInsenstiveString caseInsenstiveString1 = new CaseInsenstiveString("PubLish");

        if (string.equals(caseInsenstiveString)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (caseInsenstiveString.equals(string)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (caseInsenstiveString.equals(caseInsenstiveString1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (string.equals(caseInsenstiveString1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
