package org.pszybicki.taiding.analyzer.data.repo.datamodel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SecurityEntity {

    @Id
    private UUID id;
}
