public class Demo {
    public static void main(String argd[]){
        contaCorrente conta1 = new contaCorrente();
        conta1.numeroConta = "54869";
        conta1.limitaConta = 7000L;
        conta1.saqueConta = 3000L;
        conta1.saldoNaConta = 5500L;
        conta1.verificadorDeConta(conta1.numeroConta);
        conta1.verificarSaldo(conta1.saldoNaConta);
        conta1.realizarSaque(conta1.saldoNaConta);
    }
}
