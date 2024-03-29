package ru.strelchm.raiffeisenchallenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.strelchm.raiffeisenchallenge.domain.SockColor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InOutComeSockDto {
    @NotNull
    @Min(value = 0, message = "Sock quantity can't be less then 0")
    private Integer quantity;

    @NotNull
    @Max(value = 100, message = "Cotton part can't be greater then 100%")
    @Min(value = 0, message = "Cotton part can't be less then 0%")
    private Integer cottonPart;

    @NotNull
    private SockColor sockColor;
}
