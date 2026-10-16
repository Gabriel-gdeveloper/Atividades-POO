package inicioHeranca;
class ComponenteEletrico{
    String nome;
    
    public ComponenteEletrico(String nome) {
        this.nome = nome;   
    }
    public String potencia() {
        return "0";         
    }
}
class Resistor extends ComponenteEletrico {   
    int resistencia;
    int corrente;
    public Resistor(String nome, int resistencia, int corrente) {
        super(nome);
        this.resistencia = resistencia;
        this.corrente = corrente;
    }
    @Override 
    public String potencia() {
        int calculo = (corrente * corrente) * resistencia;
        return"Resultado da potência:" + calculo;
    }
}
    class Capacitor extends ComponenteEletrico {   
        int capacitancia;
        int tensao;
        public Capacitor(String nome, int capacitancia, int tensao) {
            super(nome);
            this.capacitancia = capacitancia;
            this.tensao = tensao;
        }
        @Override 
        public String potencia() {
            return "Capacitores não dissipam potencia";
        }
    }
    public class Heranca1 {
         public static void main(String[] args) {
            ComponenteEletrico componente1 = new ComponenteEletrico("Transistor");
            Resistor resistor1 = new Resistor(null, 25, 10);
            Capacitor capacitor1 = new Capacitor(null, 40, 10);

            System.out.println("Potencia do resistor:" + resistor1.potencia());
             System.out.println("Potencia do capacitor: " + capacitor1.potencia());
         }
    }
