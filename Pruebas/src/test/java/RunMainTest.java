import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URI;

public class RunMainTest{
    public static void main(String[] args) throws Exception {
        Child child1 = new Child();
        Secondchild child2 = new Secondchild();
        child1.setNumeroRuedas(4);
        System.out.println("Se va a mostrar el numero de ruedas que tiene en el hijo --> " + child1.getNumeroRuedas());
        System.out.println("Y ahora se va a mostrar el valor que tiene para el padre --> ");
        child1.muestreo();
        child2.muestreo();
    }
}


class Parent {
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    private int numeroRuedas = 0;
}

class Child extends Parent {
    Child() {

    }

    public void muestreo() {
        System.out.println(super.getNumeroRuedas());
    }

}


class Secondchild extends Parent {

    public void muestreo() {
        System.out.println(super.getNumeroRuedas());
    }
}