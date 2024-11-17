public class Car {
    public String name;
    public int age;
    public String model;
    public String color;
    public boolean ligado;
    public int aceleracao;

    public Car(String name, int age, String model, String color) {
        this.name = name;
        this.age = age;
        this.model = model;
        this.color = color;
        this.ligado = false;
        this.aceleracao = 0;
    }

    public void ligar() {
        if (this.ligado) {
            return;
        }
        this.ligado = true;
    }

    public void desligar() {
        if (!(this.ligado)) {
            return;
        }
        this.aceleracao = 0;
        this.ligado = false;
    }

    public void acelerar(String intensidade) {
        if (!(this.ligado)) {
            return;
        }

        if (intensidade == "fraco") {
            this.aceleracao += 100;
        } else if (intensidade == "forte") {
            this.aceleracao += 500;
        }
    }

    public void acelerar() {
        if (!(this.ligado)) {
            return;
        }
        this.aceleracao += 200;
    }

}
