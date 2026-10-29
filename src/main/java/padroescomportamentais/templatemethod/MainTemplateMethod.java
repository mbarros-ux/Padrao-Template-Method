package padroescomportamentais.templatemethod;

public class MainTemplateMethod {
    public static void main(String[] args) {

        AuditoriaDeSeguranca auditoriaRede = new AuditoriaRedeInterna();
        AuditoriaDeSeguranca auditoriaWeb = new AuditoriaAplicacaoWeb();

        System.out.println("CENÁRIO 1: Auditoria de Rede Interna");
        auditoriaRede.executarAuditoria();

        System.out.println("CENÁRIO 2: Auditoria de Aplicação Web");
        auditoriaWeb.executarAuditoria();
    }
}