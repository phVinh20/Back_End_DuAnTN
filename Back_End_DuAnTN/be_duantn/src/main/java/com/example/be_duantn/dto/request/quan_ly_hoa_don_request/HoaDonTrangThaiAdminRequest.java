package com.example.be_duantn.dto.request.quan_ly_hoa_don_request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonTrangThaiAdminRequest {

    private UUID id;

    private Date ngaycapnhat;

    private Double tiengiaohang;

    private String sdtnguoinhan;

    private String emailnguoinhan;

    private String diachinhanhang;

    private String ghichu;

    private Integer trangthai;

    private UUID nhanvien;

    private String donvigiaohang;

    private String tennguoigiao;

    private String sdtnguoigiao;

    private Date ngaythanhtoan;

}
