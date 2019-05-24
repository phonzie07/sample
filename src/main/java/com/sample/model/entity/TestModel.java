package com.sample.model.entity;

import com.generic.core.base.data.BaseEntity;
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
@Access( AccessType.FIELD )
@EqualsAndHashCode(callSuper = false)
@AttributeOverride( name = "id", column = @Column( name = "test_id" ) )
public class TestModel extends BaseEntity {

    @Column( name = "test_name" )
    private String name;

    /**
     * Instantiates a new Api type.
     *
     * @param name the name
     */
    public TestModel(String name ) {
        this.name = name;
    }

}
