package org.pszybicki.taiding.analyzer.data.repo;

import org.pszybicki.taiding.analyzer.data.exchange.SecurityDto;
import org.pszybicki.taiding.analyzer.data.repo.datamodel.SecurityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Service
public class SavingServiceImpl implements SavingService {

    @Autowired
    SecurityRepo securityRepo;

    @Override
    public boolean saveSecurity(SecurityDto securityDto) {
        final SecurityEntity s = new SecurityEntity(randomUUID());
        securityRepo.save(s);
        return true;
    }
}

