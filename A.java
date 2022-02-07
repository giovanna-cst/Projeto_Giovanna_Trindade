public class A{
    //atributos
    private int A1;
    private float A2;

    //construtor
    public A(int A1, float A2){
        this.A1 = A1;
        this.A2 = A2;
    }

    //métodos
    public int getA1() {
        return A1;
    }

    public float getA2(){
        return A2;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }

    public void setA2(float A2){
        this.A2 = A2;
    }

    public String MA1(){
        System.out.println("MA1");
        return "MA1";
    }

    public String MA2(){
        System.out.println("MA2");
        return "MA2";
    }

    public String MA3(){
        System.out.println("Alteração a classe A partir do clone");
        return "Alteração a classe A partir do clone";
    }
}