package Factory;

import BankingCurrency.CadCurrency;
import BankingCurrency.UsdCurrency;
import Interfaces.IbankingCurrency;

public class AtmFactory {

    public static IbankingCurrency getCurrencyType(String accountName){

        if(accountName == null){
            return null;
        }
        if(accountName.equalsIgnoreCase("USD")){
            return new UsdCurrency();
        }
        else if(accountName.equalsIgnoreCase("CAD")){
            return new CadCurrency();
        }
        return  null;
    }
}
