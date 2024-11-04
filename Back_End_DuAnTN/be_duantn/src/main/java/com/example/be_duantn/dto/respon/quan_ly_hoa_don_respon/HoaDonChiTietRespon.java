package com.example.be_duantn.dto.respon.quan_ly_hoa_don_respon;

import java.util.Date;
import java.util.UUID;

public interface HoaDonChiTietRespon {

    UUID getid();

    Integer getsoluong();

    Double getdongia();

    Double getdongiakhigiam();

    Date getngaytao();

    String getghichu();

    String gettensp();

    String getimagedefaul();

    String gettensize();

    String gettenmausac();

    Integer gettrangthai();


}
