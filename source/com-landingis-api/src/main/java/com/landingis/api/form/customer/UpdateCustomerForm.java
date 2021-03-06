package com.landingis.api.form.customer;

import com.landingis.api.validation.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class UpdateCustomerForm {
    private String avatarPath;

    private String password;

    @NotNull(message = "id cannot be null")
    @ApiModelProperty(required = true)
    private Long id;

    @NotEmpty(message = "fullName cannot be null")
    @ApiModelProperty(required = true)
    private String fullName;

    @NotEmpty(message = "address cannot be null")
    @ApiModelProperty(required = true)
    private String address;

    @NotEmpty(message = "birthDay cannot be null")
    @ApiModelProperty(required = true)
    private Date birthDay;

    private String note;

    @NotNull(message = "status cannot be null")
    @ApiModelProperty(required = true)
    @Status
    private Integer status;
}
