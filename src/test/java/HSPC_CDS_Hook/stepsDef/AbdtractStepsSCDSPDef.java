package HSPC_CDS_Hook.stepsDef;

import Help.services.rest.RestService;
import Help.services.ui.models.HSPCHomePage;
import Help.services.ui.models.HSPCSandboxSelectionPage;
import Help.services.ui.models.HSPSLoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import HSPC_CDS_Hook.configuration.AppConfig;

@ContextConfiguration(classes = {AppConfig.class})
@DirtiesContext
public class AbdtractStepsSCDSPDef {
    @Autowired
    @Lazy
    public RestService restService;

    @Autowired
    @Lazy
    public HSPSLoginPage hspcloginPage;

    @Autowired
    @Lazy
    public HSPCSandboxSelectionPage hcpsSandboxSelectionPage;

    @Autowired
    @Lazy
    public HSPCHomePage HomePage;
}
