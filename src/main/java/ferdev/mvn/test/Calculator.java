package ferdev.mvn.test;


public class Calculator {

    public double tambah(int v1, int v2){
        return v1 + v2;
    }

    public double bagi(int v1, int v2){
        if(v2 == 0){
            throw  new IllegalArgumentException("tidak bisa bagi 0");
        }
        return v1 / v2;
    }

    public void cobaGeneric(){
        Generic<String> gen = new Generic<>("Feri", "Winarta");
        System.out.println(gen.getData1() + " " + gen.getData2());
        
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.cobaGeneric();


    }


}
