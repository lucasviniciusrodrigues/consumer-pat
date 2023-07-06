package br.com.alelo.consumer.consumerpat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuyModel {

    EstablishmentTypeEnum establishmentTypeEnum;
    String establishmentName;
    Integer cardNumber;
    String productDescription;
    Double value;

}