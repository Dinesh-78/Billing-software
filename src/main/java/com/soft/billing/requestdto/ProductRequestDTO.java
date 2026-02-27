package com.soft.billing.requestdto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequestDTO {

	 @NotBlank(message = "Product name is required")
	    private String productName;

	    @NotNull(message = "Selling price is required")
	    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
	    private BigDecimal productPrice;

	    @NotNull(message = "MRP is required")
	    @DecimalMin(value = "0.0", inclusive = false, message = "MRP must be greater than 0")
	    private BigDecimal productMrp;

	    @NotNull(message = "GST rate is required")
	    @Min(value = 0, message = "GST cannot be negative")
	    @Max(value = 100, message = "GST cannot be more than 100%")
	    private Double gstRate;

	    @NotNull(message = "Quantity is required")
	    @Min(value = 0, message = "Quantity cannot be negative")
	    private Integer productQuantity;

	    @NotBlank(message = "Category is required")
	    private String category;
}
