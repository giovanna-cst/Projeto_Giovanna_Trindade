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

    public int setA1(int entrarA1) {
        this.entrarA1 = A1;
    }

    public float setA2(float entrarA2){
        this.entrarA2 = A2;
    }

    public String MA1(){
        System.out.println("MA1");
        return "MA1";
    }

    public String MA2(){
        System.out.println("MA2");
        return "MA2";
    }
}