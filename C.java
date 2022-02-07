public class C{
    //atributos
    private String C1;
    private int C2;

    //construtor
    public C(String C1, int C2){
        this.C1 = C1;
        this.C2 = C2;
    }

    //métodos
    public String getC1() {
        return C1;
    }

    public int getC2(){
        return C2;
    }

    public void setC1(String C1) {
        this.C1 = C1;
    }

    public void setC2(int C2){
        this.C2 = C2;
    }

    public String MC1(){
        System.out.println("MC1");
        return "MC1";
    }

    public String MC2(){
        System.out.println("MC2");
        return "MC2";
    }

    public String MC3(){
        System.out.println("MC3");
        return "MC3";
    }
}