package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "bank_account_id",
        "status"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccountResponse implements Serializable {

    private final static long serialVersionUID = 8613493996624315743L;

    @JsonProperty("bank_account_id")
    @NonNull
    public String bankAccountId;
    @JsonProperty("status")
    @NonNull
    public String status;

}