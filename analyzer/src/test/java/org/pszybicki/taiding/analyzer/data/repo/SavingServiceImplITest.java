package org.pszybicki.taiding.analyzer.data.repo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pszybicki.taiding.analyzer.data.exchange.SecurityDto;
import org.pszybicki.taiding.analyzer.data.repo.datamodel.SecurityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest({
        "spring.datasource.driver-class-name=org.h2.Driver",
        "spring.datasource.url=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1",
        "spring.datasource.username=sa",
        "spring.datasource.password=sa"
})
public class SavingServiceImplITest {

    @Autowired
    SavingService savingService;

    @Autowired
    SecurityRepo securityRepo;

    @Test
    public void saveSecurity() throws Exception {
        final SecurityDto securityDto = new SecurityDto();
        final boolean saved = savingService.saveSecurity(securityDto);
        assertThat(saved).isTrue();

        final Iterable<SecurityEntity> all = securityRepo.findAll();
        assertThat(all).hasSize(1);
    }

}