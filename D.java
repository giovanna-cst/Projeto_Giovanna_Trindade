public class D{
    //atributos
    private String D1;
    private int D2;

    //construtor
    public D(String D1, int D2){
        this.D1 = D1;
        this.D2 = D2;
    }

    //métodos
    public String getD1() {
        return D1;
    }

    public int getD2(){
        return D2;
    }

    public void setD1(String D1) {
        this.D1 = D1;
    }

    public void setD2(int D2){
        this.D2 = D2;
    }

    public String MD1(){
        System.out.println("MD1");
        return "MD1";
    }

    public String MD2(){
        System.out.println("MD2");
        return "MD2";
    }

    public String MD3(){
        System.out.println("MD3");
        return "MD3";
    }
}