package org.pszybicki.taiding.analyzer.data.repo;

import org.pszybicki.taiding.analyzer.data.exchange.SecurityDto;

public interface SavingService {

    public boolean saveSecurity(SecurityDto securityDto);
}
