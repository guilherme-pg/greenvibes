package com.gvmmpg.greenvibes.domain.product;

public record ProductRegister(String product_name,
                              String product_type,
                              String product_materials,
                              String product_dimensions,
                              String product_model,
                              Integer product_year,
                              Integer product_weight,
                              String product_description) {
}
