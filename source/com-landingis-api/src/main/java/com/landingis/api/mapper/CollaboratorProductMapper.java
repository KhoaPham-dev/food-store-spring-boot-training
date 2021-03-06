package com.landingis.api.mapper;

import com.landingis.api.dto.collaborator.CollaboratorDto;
import com.landingis.api.dto.collaborator.CollaboratorProductDto;
import com.landingis.api.form.collaborator.*;
import com.landingis.api.storage.model.Collaborator;
import com.landingis.api.storage.model.CollaboratorProduct;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {ProductMapper.class,CollaboratorMapper.class})
public interface CollaboratorProductMapper {
    @Mapping(source = "collaboratorId", target = "collaborator.id")
    @Mapping(source = "productId", target = "product.id")
    @Mapping(source = "kind", target = "kind")
    @Mapping(source = "value", target = "value")
    @Mapping(source = "status", target = "status")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminCreateMapping")
    CollaboratorProduct fromCreateCollaboratorProductFormToEntity(CreateCollaboratorProductForm createCollaboratorProductForm);

    @IterableMapping(elementTargetType = CollaboratorProduct.class, qualifiedByName = "adminCreateMapping")
    List<CollaboratorProduct> fromCreateCollaboratorProductListFormToEntityList(List<CreateCollaboratorProductForm> createCollaboratorProductFormList);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "kind", target = "kind")
    @Mapping(source = "value", target = "value")
    @Mapping(source = "status", target = "status")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminUpdateMapping")
    void fromUpdateCollaboratorProductFormToEntity(UpdateCollaboratorProductForm updateCollaboratorProductForm, @MappingTarget CollaboratorProduct collaboratorProduct);

    @IterableMapping(elementTargetType = CollaboratorProduct.class, qualifiedByName = "adminUpdateMapping")
    List<CollaboratorProduct> fromUpdateCollaboratorProductListFormToEntityList(List<UpdateCollaboratorProductForm> updateCollaboratorProductFormList);

    /*-------------------------DELETE FORM--------------------------*/
    @Mapping(source = "id", target = "id")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminDeleteMapping")
    void fromDeleteCollaboratorProductFormToEntity(DeleteCollaboratorProductForm deleteCollaboratorProductForm, @MappingTarget CollaboratorProduct collaboratorProduct);

    @IterableMapping(elementTargetType = CollaboratorProduct.class, qualifiedByName = "adminDeleteMapping")
    List<CollaboratorProduct> fromDeleteCollaboratorProductListFormToEntityList(List<DeleteCollaboratorProductForm> deleteCollaboratorProductFormList);


    @Mapping(source = "id", target = "id")
    @Mapping(source = "collaborator", target = "collaboratorDto",qualifiedByName="collaboratorAutoCompleteMapping")
    @Mapping(source = "product", target = "productDto",qualifiedByName="productAutoCompleteMapping")
    @Mapping(source = "kind", target = "kind")
    @Mapping(source = "value", target = "value")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "modifiedDate", target = "modifiedDate")
    @Mapping(source = "modifiedBy", target = "modifiedBy")
    @Mapping(source = "createdDate", target = "createdDate")
    @Mapping(source = "createdBy", target = "createdBy")
    @BeanMapping(ignoreByDefault = true)
    @Named("adminGetMapping")
    CollaboratorProductDto fromEntityToCollaboratorProductDto(CollaboratorProduct collaboratorProduct);

    @IterableMapping(elementTargetType = CollaboratorProductDto.class, qualifiedByName = "adminGetMapping")
    List<CollaboratorProductDto> fromEntityListToCollaboratorProductDtoList(List<CollaboratorProduct> collaboratorProducts);
}
