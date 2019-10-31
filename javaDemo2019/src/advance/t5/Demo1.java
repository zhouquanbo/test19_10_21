package advance.t5;

import java.util.Objects;

public class Demo1 {

    public static void main(String[] args) {
        a s = new a(1,"as");
        a s1= new a(1,"as");
        System.out.println(s.equals(s1));

    }
}

class a{
    private int a;
    private String s;

    public a() {
    }

    public a(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "a{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a a1 = (a) o;
        return a == a1.a &&
                Objects.equals(s, a1.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, s);
    }
}