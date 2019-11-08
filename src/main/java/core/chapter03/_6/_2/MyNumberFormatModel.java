package core.chapter03._6._2;

import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;

public class MyNumberFormatModel {
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private BigDecimal decimal;
}
