public class contaCorrente {
    String numeroConta;
    Long limitaConta;
    boolean contaEspecial;
    Long saqueConta;
    Long saldoNaConta;

    void verificarSaldo(Long saldoNaConta) {
        if (saldoNaConta == 0) {
            System.out.println("Você não possui saldo na conta");
        } else {
            System.out.println("seu saldo é de: " + saldoNaConta);
        }
    }

    void realizarSaque(Long saldoNaConta){
        if(saldoNaConta > saqueConta){
            System.out.println("Você pode realizar um saque de até:" + (saldoNaConta - saqueConta));
        }else {
            System.out.println("Você não pode realizar Saque");
        }
    }
    void verificadorDeConta(String numeroConta) {
        String numeroContaStr = String.valueOf(numeroConta);
        if (numeroContaStr.startsWith("0")) {
            contaEspecial = true;
                System.out.println("essa conta é especial");
            } else {
                System.out.println("essa conta não é especial");
            }
        }
    }
/**
 * crie uma classe para representar uma conta corrente
 * que possui um numero e uma status que informa se ela
 * é especial ou não e um limite
 * desenvolva métodos para realizar saque verificando se o
 * cliente pode realizar saques, depositar dinheiro e verificar
 * se o cliente está usando cheque especial ou não
 */