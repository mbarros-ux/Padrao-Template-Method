package padroescomportamentais.templatemethod;

public class AuditoriaRedeInterna extends AuditoriaDeSeguranca {

    @Override
    protected void coletarDados() {
        System.out.println("[Rede] Coletando topologia de rede, portas abertas e logs de firewall...");
    }

    @Override
    protected void analisarVulnerabilidades() {
        System.out.println("[Rede] Analisando portas expostas e tentativas de intrusão na rede local (Nmap/Nessus)...");
    }

    @Override
    protected void gerarRelatorio() {
        System.out.println("[Rede] Gerando relatório de segurança perimetral em formato PDF...");
    }

}