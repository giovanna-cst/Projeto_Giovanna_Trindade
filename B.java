public class B{
    //atributos
    private int B1;
    private float B2;

    //construtor
    public B(int B1, float B2){
        this.B1 = B1;
        this.B2 = B2;
    }

    //métodos
    public int getB1() {
        return B1;
    }

    public float getB2(){
        return B2;
    }

    public int setB1(int entrarB1) {
        this.entrarB1 = B1;
    }

    public float setB2(float entrarB2){
        this.entrarB2 = B2;
    }

    public String MB1(){
        System.out.println("MB1");
        return "MB1";
    }

    public String MB2(){
        System.out.println("MB2");
        return "MB2";
    }
}