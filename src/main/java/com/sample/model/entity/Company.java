package com.sample.model.entity;

import com.generic.core.base.data.AuditableEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * The TestModel entity.
 */
@Data
@Table
@Entity
@NoArgsConstructor
@Access(AccessType.FIELD)
@EqualsAndHashCode(callSuper = false)
@AttributeOverride(name = "id", column = @Column(name = "company_id"))
public class Company extends AuditableEntity {
    private String name;
    private String code;
    private String description;

}
