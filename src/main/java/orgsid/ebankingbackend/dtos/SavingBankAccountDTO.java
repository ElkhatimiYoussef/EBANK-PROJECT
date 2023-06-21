package orgsid.ebankingbackend.dtos;

import lombok.Data;
import orgsid.ebankingbackend.enums.AccountStatus;
import java.util.Date;



@Data

public class SavingBankAccountDTO extends BankAccountDTO {

    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;//De Type Enum
    private CustomerDTO customerDTO;
    private double interestRate;
}

























