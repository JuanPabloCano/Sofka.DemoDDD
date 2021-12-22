package co.com.sofka.domain.categoryManagement.values;

import co.com.sofka.generic.Id;

public class CategoryManagementId extends Id {

    private CategoryManagementId(String value) {
        super(value);
    }

    public CategoryManagementId() {
    }

    public static CategoryManagementId of(String value) {
        return new CategoryManagementId(value);
    }

}
