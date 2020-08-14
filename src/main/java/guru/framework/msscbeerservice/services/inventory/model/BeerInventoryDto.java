package guru.framework.msscbeerservice.services.inventory.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerInventoryDto {
    private UUID id;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private UUID beerId;
    private Integer quantityOnHand;
}
