public class Main {
    public boolean  bap;
    public boolean  meat;
    public boolean  cheese;
    public boolean  greenery;
    public boolean mayonnaise;
    public Main() {
        this.bap = true;
        this.meat = true;
        this.cheese = true;
        this.greenery = true;
        this.mayonnaise = true;
        System.out.println("звичайний бургер (усі компоненти)");
        System.out.println("Звичайний бургер із наступними компонентами: булочка, м'ясо, сир, зелень, майонез");
        System.out.println();

    }
    public Main(boolean  bap, boolean  meat, boolean  cheese,boolean  greenery) {
        this.bap = true;
        this.meat = true;
        this.cheese = true;
        this.greenery = true;
        System.out.println("дієтичний бургер (без майонезу)");
        System.out.println("Дієтичний бургер із наступними компонентами: булочка, м'ясо, сир, зелень, без майонезу");
        System.out.println();
    }
    public Main(boolean  bap, boolean  meat, boolean  cheese,boolean  greenery,boolean mayonnaise) {
        this.bap = true;
        this.meat = true;
        this.cheese = true;
        this.greenery = true;
        this.mayonnaise = true;
        System.out.println("з подвійним м'ясом");
        System.out.println("Бургер з подвійним м'ясом з такими компонентами: булочка, два шматки м'яса, сир, зелень, майонез");
        System.out.println();
    }
}
