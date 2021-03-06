package com.landingis.api.form.orders;

import com.landingis.api.validation.AmountOrdersDetail;
import com.landingis.api.validation.OrdersState;
import com.landingis.api.validation.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateOrdersDetailForm {

    @NotNull(message = "productId cannot be null")
    @ApiModelProperty(required = true)
    private Long productId;

    @AmountOrdersDetail
    @NotNull(message = "amount cannot be null")
    @ApiModelProperty(required = true)
    private Integer amount;

    private String note;

}
