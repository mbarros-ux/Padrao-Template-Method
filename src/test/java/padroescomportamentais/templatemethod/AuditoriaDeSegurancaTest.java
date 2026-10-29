package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;

class AuditoriaDeSegurancaTest {

    @Test
    void deveExecutarFluxoCorretoParaRedeInterna() {
        AuditoriaDeSeguranca auditoria = new AuditoriaRedeInterna();
        assertDoesNotThrow(() -> auditoria.executarAuditoria());
    }

    @Test
    void deveExecutarFluxoCorretoParaAplicacaoWebComHook() {
        AuditoriaDeSeguranca auditoria = new AuditoriaAplicacaoWeb();
        assertDoesNotThrow(() -> auditoria.executarAuditoria());
    }

    @Test
    void metodoTemplateDeveSerFinalParaGarantirIntegridade() throws NoSuchMethodException {
        Method metodoTemplate = AuditoriaDeSeguranca.class.getDeclaredMethod("executarAuditoria");
        assertTrue(Modifier.isFinal(metodoTemplate.getModifiers()),
                "O método executarAuditoria() DEVE ser final para impedir que subclasses alterem o fluxo.");
    }

    @Test
    void passosObrigatoriosDevemSerAbstratos() throws NoSuchMethodException {
        Method coletar = AuditoriaDeSeguranca.class.getDeclaredMethod("coletarDados");
        Method analisar = AuditoriaDeSeguranca.class.getDeclaredMethod("analisarVulnerabilidades");
        Method gerar = AuditoriaDeSeguranca.class.getDeclaredMethod("gerarRelatorio");

        assertTrue(Modifier.isAbstract(coletar.getModifiers()));
        assertTrue(Modifier.isAbstract(analisar.getModifiers()));
        assertTrue(Modifier.isAbstract(gerar.getModifiers()));
    }

    @Test
    void metodoHookNaoDeveSerAbstrato() throws NoSuchMethodException {
        Method hook = AuditoriaDeSeguranca.class.getDeclaredMethod("hookPersonalizacao");
        assertFalse(Modifier.isAbstract(hook.getModifiers()),
                "O método hook deve ter uma implementação padrão vazia, não ser abstrato.");
    }
}