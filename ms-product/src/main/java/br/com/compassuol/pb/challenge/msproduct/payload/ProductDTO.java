package br.com.compassuol.pb.challenge.msproduct.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private LocalDateTime date;
    private String name;
    private String description;
    private String imgUrl;
    private BigDecimal price;
}
