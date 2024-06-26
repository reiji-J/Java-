package org.example;

public class Quadruple<T> {
    private T first;
    private T second;
    private T third;
    private T fourth;

    Quadruple(T first, T second, T third, T fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <A> Quadruple<A> getQuadrupleBy(Pair<Pair<A>> pairPair){
        return new Quadruple<A>(
                pairPair.first.first,
                pairPair.first.second,
                pairPair.second.first,
                pairPair.second.second
        );

    }
}
