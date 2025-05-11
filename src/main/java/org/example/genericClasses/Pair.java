package org.example.genericClasses;

public class Pair <F,D>{
    private F first;
    private D second;

    public Pair(F first, D second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public D getSecond() {
        return second;
    }

    public void setSecond(D second) {
        this.second = second;
    }

    public void swap(){
        F temp = first;
        first = (F) second;
        second = (D) temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
