package greencity.service;

import greencity.entity.Discount;
import java.util.Set;

/**
 * Provides the interface to manage {@code Discount} entity.
 */
public interface DiscountService {
    /**
     * Method for saving new Discount to database.
     *
     * @param discount - Discount entity.
     * @return a discount.
     */
    Discount save(Discount discount);

    /**
     * Find Discount entity by id.
     *
     * @param id - Discount id.
     * @return Discount entity.
     */
    Discount findById(Long id);

    /**
     * Finds all {@code Discount} records related to the specified {@code Place}.
     *
     * @param placeId to find by.
     * @return a set of the {@code Discount} for the place by id.
     */
    Set<Discount> findAllByPlaceId(Long placeId);

    /**
     * Delete all {@code Discount} records related to the specified {@code Place}.
     *
     * @param placeId to find by.
     */
    void deleteAllByPlaceId(Long placeId);
}
