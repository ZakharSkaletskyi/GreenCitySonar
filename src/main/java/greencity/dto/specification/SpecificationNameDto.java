package greencity.dto.specification;

import greencity.constant.ValidationConstants;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecificationNameDto {
    @NotNull(message = ValidationConstants.EMPTY_SPECIFICATION_NAME)
    @NotEmpty(message = ValidationConstants.EMPTY_SPECIFICATION_NAME)
    private String name;
}
