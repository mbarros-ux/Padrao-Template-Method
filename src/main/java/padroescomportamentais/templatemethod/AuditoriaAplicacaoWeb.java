package padroescomportamentais.templatemethod;

public class AuditoriaAplicacaoWeb extends AuditoriaDeSeguranca {

    @Override
    protected void coletarDados() {
        System.out.println("[Web] Coletando endpoints da API, cabeçalhos HTTP e certificados SSL...");
    }

    @Override
    protected void analisarVulnerabilidades() {
        System.out.println("[Web] Executando varredura contra OWASP Top 10 (SQLi, XSS, CSRF)...");
    }

    @Override
    protected void gerarRelatorio() {
        System.out.println("[Web] Gerando relatório de vulnerabilidades de aplicação em formato JSON...");
    }

    @Override
    protected void hookPersonalizacao() {
        System.out.println("[Web - Hook] Validando tokens de sessão JWT e políticas de CORS adicionais...");
    }
}