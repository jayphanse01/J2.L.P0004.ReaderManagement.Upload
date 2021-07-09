package khanhpl.daos;

import java.util.ArrayList;
import khanhpl.dtos.ReaderDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jayph
 */
public class ReaderDAO {

    private static ArrayList<ReaderDTO> readerList = new ArrayList<>();
    public ArrayList<ReaderDTO> getReaderList(){
        return readerList;
    }

    public boolean createReader(ReaderDTO dto) {

        readerList.add(dto);

        return true;
    }
    
    
    public boolean updateReader(ReaderDTO dto){
        boolean chkUpdate = false;
        for (ReaderDTO readerDTO : readerList) {
            if (dto.getReaderID().equalsIgnoreCase(readerDTO.getReaderID())) {
                chkUpdate = true;
                readerDTO.setReaderName(dto.getReaderName());
                readerDTO.setGender(dto.isGender());
                readerDTO.setBirthday(dto.getBirthday());
                readerDTO.setAddress(dto.getAddress());
                readerDTO.setEmail(dto.getEmail());
                readerDTO.setPhone(dto.getPhone());
            }
        }
        return chkUpdate;
    }
    
    public boolean deleteReader(String readerID){
        boolean chkDelete = false;
        for (int i = 0; i < readerList.size(); i++) {
            if (readerList.get(i).getReaderID().equalsIgnoreCase(readerID)) {
                chkDelete = true;
                readerList.remove(i);
            }
        }
        return chkDelete;
    }
    
    public boolean searchByID(String readerID){
        boolean chkSearchByID = false;
        for (ReaderDTO dto : readerList) {
            if (dto.getReaderID().equals(readerID)) {
                chkSearchByID = true;
            }
        }
        return chkSearchByID;
    }
}
