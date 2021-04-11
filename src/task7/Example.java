package task7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Example that = (Example) o;
        return Objects.equals(this.first, that.first)
                && Objects.equals(this.last, that.last);

    }

    @Override
    public final int hashCode() {


        return Objects.hash(first, last);
    }
}