package padroescomportamentais.templatemethod;

public abstract class AuditoriaDeSeguranca {
    public final void executarAuditoria() {
        System.out.println("=== Iniciando Processo de Auditoria ===");

        coletarDados();
        analisarVulnerabilidades();
        gerarRelatorio();

        hookPersonalizacao();

        System.out.println("=== Auditoria concluída com sucesso. ===\n");
    }

    protected abstract void coletarDados();
    protected abstract void analisarVulnerabilidades();
    protected abstract void gerarRelatorio();


    protected void hookPersonalizacao() {

    }
}