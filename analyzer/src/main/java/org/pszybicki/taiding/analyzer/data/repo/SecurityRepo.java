package org.pszybicki.taiding.analyzer.data.repo;

import org.pszybicki.taiding.analyzer.data.repo.datamodel.SecurityEntity;
import org.springframework.data.repository.CrudRepository;

public interface SecurityRepo extends CrudRepository<SecurityEntity, String> {
}
