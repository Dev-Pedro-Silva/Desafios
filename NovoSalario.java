import javax.swing.JOptionPane;
public class NovoSalario {
    public static void main(String[] args) {
        float salario = 0;
        boolean validacao;
        do {
            validacao = true;
            try {
                salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário atual do colaborador (em R$)").replace(',' , '.'));
                if (salario < 0) {
                    JOptionPane.showMessageDialog(null, "O salário não pode ser um saldo negativo!!", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception exception){
                validacao = false;
                JOptionPane.showMessageDialog(null, "Insira apenas dados numéricos!!", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (salario < 0 || validacao == false);
        int aumento;
        if (salario <= 280) {
            aumento = 20;
        } else if (salario <= 700) {
            aumento = 15;
        } else if (salario <= 1500) {
            aumento = 10;
        } else {
            aumento = 5;
        }
        float novosalario = salario * (1 + (aumento/100f));
        float valoraumento = salario * (aumento/100f);
        float salarioreal = novosalario * (1 - (3.8f/100));
        JOptionPane.showMessageDialog(null, "Salário antes do reajuste: R$" + String.format("%.2f", salario) + "\n" +
                "Percentual de aumento aplicado: " + aumento + "%\n" +
                "Valor do aumento: R$" + String.format("%.2f", valoraumento) + "\n" +
                "Novo Salário: R$" + String.format("%.2f",novosalario) + "\n" +
                "Salario Real (descontando a inflação): R$" + String.format("%.2f", salarioreal));

    }
}
