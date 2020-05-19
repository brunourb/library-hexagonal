package io.wkrzywiec.hexagonal.library.domain.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddNewBookCommand {
    private String googleBookId;
}