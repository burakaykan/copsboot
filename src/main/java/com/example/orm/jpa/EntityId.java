package com.example.orm.jpa;

/**
 * Interface for primary keys of entities.
 *
 * @param <T> the underlying type of the entity id
 */

import java.io.Serializable;

public interface EntityId<T> extends Serializable {
    T getId();
    String asString();
}
