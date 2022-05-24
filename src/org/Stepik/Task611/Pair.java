package org.Stepik.Task611;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Pair <T, S> {
    private final T first;
    private final S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException("No value present");
        }
        return first;
    }

    public Object getSecond() {
        if (second == null) {
            throw new NoSuchElementException("No value present");
        }
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static Pair of(Object value1, Object value2) {
        return new Pair(value1, value2);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

            Function <T, U> func = x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);

            return func;
    }

}
