package ru.inno.course.currency_converter;

import java.util.Objects;

class Pair {
    private final String ccy1;
    private final String ccy2;

    public Pair(String ccy1, String ccy2) {
        this.ccy1 = ccy1;
        this.ccy2 = ccy2;
    }

    public String getCcy1() {
        return ccy1;
    }

    public String getCcy2() {
        return ccy2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair pair)) return false;
        return Objects.equals(getCcy1(), pair.getCcy1()) && Objects.equals(getCcy2(), pair.getCcy2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCcy1(), getCcy2());
    }

    @Override
    public String toString() {
        return "Pair{" +
                "ccy1='" + ccy1 + '\'' +
                ", ccy2='" + ccy2 + '\'' +
                '}';
    }
}
