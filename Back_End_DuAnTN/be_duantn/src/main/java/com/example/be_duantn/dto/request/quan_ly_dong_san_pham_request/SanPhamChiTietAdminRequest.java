package com.example.be_duantn.dto.request.quan_ly_dong_san_pham_request;

import jakarta.validation.constraints.NotNull;
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
public class SanPhamChiTietAdminRequest {

    private UUID idspct;

    @NotNull(message = "Loại sản phẩm không được để trống")
    private Integer soluongton;

    private String mota;

    private String qrcode;

    @NotNull(message = "Trạng thái sản phẩm không được để trống")
    private Integer trangthai;

    private Date ngaytao = new Date();

    @NotNull(message = "Xuất xứ không được để trống")
    private UUID sanpham;

    @NotNull(message = "Xuất xứ không được để trống")
    private UUID mausac;

    @NotNull(message = "Xuất xứ không được để trống")
    private UUID size;
}
