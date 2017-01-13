package Equals;

/**
 * Created by leixun on 16/9/8.
 */
public final class CaseInsenstiveString {
    private final String s;

    public CaseInsenstiveString(String s) {
        if (s==null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsenstiveString && ((CaseInsenstiveString)obj).s.equalsIgnoreCase(s);
    }
}
