package com.landingis.api.mapper;

import com.landingis.api.dto.collaborator.CollaboratorDto;
import com.landingis.api.dto.customer.CustomerDto;
import com.landingis.api.dto.employee.EmployeeDto;
import com.landingis.api.dto.employee.EmployeeDto;
import com.landingis.api.form.employee.CreateEmployeeForm;
import com.landingis.api.form.employee.UpdateEmployeeForm;
import com.landingis.api.storage.model.Collaborator;
import com.landingis.api.storage.model.Customer;
import com.landingis.api.storage.model.Employee;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {AccountMapper.class})
public interface EmployeeMapper {
    @Mapping(source = "username", target = "account.username")
    @Mapping(source = "email", target = "account.email")
    @Mapping(source = "avatarPath", target = "account.avatarPath")
    @Mapping(source = "phone", target = "account.phone")
    @Mapping(source = "fullName", target = "account.fullName")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "birthDay", target = "birthday")
    @Mapping(source = "sex", target = "sex")
    @Mapping(source = "note", target = "note")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "identityNumber", target = "identityNumber")
    @Mapping(source = "dateOfIssue", target = "dateOfIssue")
    @Mapping(source = "placeOfIssue", target = "placeOfIssue")
    @Mapping(source = "bankNo", target = "bankNo")
    @Mapping(source = "bankName", target = "bankName")
    @Mapping(source = "branchName", target = "branchName")
    @Mapping(source = "labelColor", target = "labelColor")
    @Mapping(source = "salary", target = "salary")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminCreateMapping")
    Employee fromCreateEmployeeFormToEntity(CreateEmployeeForm createEmployeeForm);

    @Mapping(source = "username", target = "account.username")
    @Mapping(source = "avatarPath", target = "account.avatarPath")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "fullName", target = "account.fullName")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "birthDay", target = "birthday")
    @Mapping(source = "note", target = "note")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "identityNumber", target = "identityNumber")
    @Mapping(source = "dateOfIssue", target = "dateOfIssue")
    @Mapping(source = "placeOfIssue", target = "placeOfIssue")
    @Mapping(source = "bankNo", target = "bankNo")
    @Mapping(source = "bankName", target = "bankName")
    @Mapping(source = "branchName", target = "branchName")
    @Mapping(source = "labelColor", target = "labelColor")
    @Mapping(source = "salary", target = "salary")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminUpdateMapping")
    void fromUpdateEmployeeFormToEntity(UpdateEmployeeForm updateEmployeeForm, @MappingTarget Employee employee);

    @Mapping(source = "account.username", target = "username")
    @Mapping(source = "account.kind", target = "kind")
    @Mapping(source = "account.email", target = "email")
    @Mapping(source = "account.avatarPath", target = "avatarPath")
    @Mapping(source = "account.fullName", target = "fullName")
    @Mapping(source = "account.phone", target = "phone")
    @Mapping(source = "identityNumber", target = "identityNumber")
    @Mapping(source = "dateOfIssue", target = "dateOfIssue")
    @Mapping(source = "placeOfIssue", target = "placeOfIssue")
    @Mapping(source = "bankNo", target = "bankNo")
    @Mapping(source = "bankName", target = "bankName")
    @Mapping(source = "branchName", target = "branchName")
    @Mapping(source = "labelColor", target = "labelColor")
    @Mapping(source = "salary", target = "salary")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "birthday", target = "birthDay")
    @Mapping(source = "note", target = "note")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "modifiedDate", target = "modifiedDate")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "modifiedBy", target = "modifiedBy")
    @Mapping(source = "createdBy", target = "createdBy")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminGetMapping")
    EmployeeDto fromEntityToEmployeeDto(Employee employee);

    @IterableMapping(elementTargetType = EmployeeDto.class, qualifiedByName = "adminGetMapping")
    List<EmployeeDto> fromEntityListToEmployeeDtoList(List<Employee> employees);

    @Mapping(source = "account.username", target = "username")
    @Mapping(source = "account.kind", target = "kind")
    @Mapping(source = "account.email", target = "email")
    @Mapping(source = "account.avatarPath", target = "avatarPath")
    @Mapping(source = "account.fullName", target = "fullName")
    @Mapping(source = "account.phone", target = "phone")
    @Mapping(source = "identityNumber", target = "identityNumber")
    @Mapping(source = "dateOfIssue", target = "dateOfIssue")
    @Mapping(source = "placeOfIssue", target = "placeOfIssue")
    @Mapping(source = "bankNo", target = "bankNo")
    @Mapping(source = "bankName", target = "bankName")
    @Mapping(source = "branchName", target = "branchName")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "birthday", target = "birthDay")
    @Mapping(source = "sex", target = "sex")
    @Mapping(source = "account.group", target = "groupDto" ,qualifiedByName = "groupAutoCompleteMapping")
    @BeanMapping(ignoreByDefault = true)
    @Named("clientGetMapping")
    EmployeeDto fromEntityToEmployeeProfileDto(Employee employee);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "account", target = "accountDto",qualifiedByName="accountAutoCompleteMapping")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "birthday", target = "birthDay")
    @Mapping(source = "sex", target = "sex")
    @BeanMapping(ignoreByDefault = true)
    @Named("employeeAutoCompleteMapping")
    EmployeeDto fromEntityToAdminDtoAutoComplete(Employee employee);
}
