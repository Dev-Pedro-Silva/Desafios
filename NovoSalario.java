import javax.swing.JOptionPane;
public class NovoSalario {
    public static void main(String[] args) {
        float salario = 0;
        do {
            if (salario < 0) {
                JOptionPane.showMessageDialog(null, "O salário não pode ser um saldo negativo!!");
            }
            salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário atual do colaborador (em R$)"));
        } while (salario < 0);
        int aumento;
        float novosalario;
        if (salario <= 280) {
            aumento = 20;
        } else if (salario <= 700) {
            aumento = 15;
        } else if (salario <= 1500) {
            aumento = 10;
        } else {
            aumento = 5;
        }
        novosalario = salario * (1 + (aumento/100f));
        float valoraumento = salario * (aumento/100f);
        float salarioreal = novosalario * (1 - (3.8f/100));
        JOptionPane.showMessageDialog(null, "Salário antes do reajuste: R$" + salario + "\n" +
                "Percentual de aumento aplicado: " + aumento + "%\n" +
                "Valor do aumento: R$" + valoraumento + "\n" +
                "Novo Salário: R$" + novosalario + "\n" +
                "Salario Real (descontando a inflação): R$" + salarioreal);
    }
}
