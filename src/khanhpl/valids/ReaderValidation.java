/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanhpl.valids;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import khanhpl.dtos.ReaderDTO;

/**
 *
 * @author jayph
 */
public class ReaderValidation {

    public boolean checkReaderID(String readerID) {
        boolean chkReaderID = false;
        if (readerID.length() > 0 && readerID.length() <= 10 && readerID.matches("\\w+")) {
            chkReaderID = true;
        }
        return chkReaderID;
    }

    public boolean checkReaderName(String readerName) {
        boolean chkReaderName = false;
        if (readerName.length() <= 50 && readerName.length() > 0) {
            chkReaderName = true;
        }
        return chkReaderName;
    }

    public boolean checkAddress(String address) {
        boolean chkAddress = false;
        if (address.length() > 0 && address.matches("\\d+")) {
            chkAddress = true;
        }
        return chkAddress;
    }

    public boolean checkEmail(String email) {
        boolean chkEmail = false;
        if (email.length() > 0 && email.length() <= 30 && email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
            chkEmail = true;
        }
        return chkEmail;
    }

    public boolean checkPhone(String phone) {
        boolean chkPhone = false;
        if (phone.length() > 0 && phone.length() <= 15 && phone.matches("\\d+")) {
            chkPhone = true;
        }
        return chkPhone;
    }
    
    public boolean checkBirthday(Date birthday){
        boolean chkBirthday = false;
        Date curDay = Calendar.getInstance().getTime();
        if (birthday.before(curDay)) {
            chkBirthday = true;
        }
        return chkBirthday;
    }
    
    public boolean checkDupID(String readerID, ArrayList<ReaderDTO> readerData){
        boolean chkDupID = false;
        int count = 0;
        for (ReaderDTO dto : readerData) {
            if (readerID.equalsIgnoreCase(dto.getReaderID())) {
                count ++;
            }
        }
        
        if (count == 0) {
            chkDupID = true;
        }
        return chkDupID;
    }
}
